package com.xavier.abtairsapi.resource;

import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.xavier.abtairsapi.event.CreatedResourceEvent;
import com.xavier.abtairsapi.model.Locality;
import com.xavier.abtairsapi.repository.LocalityRepository;

@CrossOrigin(maxAge = 10, origins = { "*" })
@RestController
@RequestMapping("/localities")
public class LocalityResource {
	
	@Autowired
	private LocalityRepository localityRepository;
	
	@Autowired
	private ApplicationEventPublisher publisher;
	
	@GetMapping(params = "all")
	public List<Locality> findAll() {
		return localityRepository.findAll();
	}
	
	@GetMapping
	public List<Locality> findByOpSite(@RequestParam Long operationalSite) {
		return localityRepository.findByOperationalSiteId(operationalSite);
	}

	@GetMapping("/{id}")
	public ResponseEntity<Locality> findById(@PathVariable Long id) {
		Optional<Locality> foundLocality = localityRepository.findById(id);
		
		return foundLocality.isPresent() ? ResponseEntity.ok(foundLocality.get()) : ResponseEntity.notFound().build();
		
	}
	
	
	@PostMapping
	public ResponseEntity<Locality> criar(@Valid @RequestBody Locality locality, HttpServletResponse response) {
		Locality savedLocality = localityRepository.save(locality);
		
		publisher.publishEvent(new CreatedResourceEvent(this, response, savedLocality.getId()));
		
		return ResponseEntity.status(HttpStatus.CREATED).body(savedLocality);
	}
	
}
