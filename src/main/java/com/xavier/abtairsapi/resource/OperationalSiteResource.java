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
import com.xavier.abtairsapi.model.OperationalSite;
import com.xavier.abtairsapi.repository.OperationalSiteRepository;

@CrossOrigin(maxAge = 10, origins = {"*"})
@RestController
@RequestMapping("/opsites")
public class OperationalSiteResource {
	
	@Autowired
	private OperationalSiteRepository operationalSiteRepository;
	
	@Autowired
	private ApplicationEventPublisher publisher;
	
	@GetMapping(params = "all")
	public List<OperationalSite> findAll() {
		return operationalSiteRepository.findAll();
	}
	
	
	@GetMapping
	public List<OperationalSite> findByDisctrict(@RequestParam Long district) {
		return operationalSiteRepository.findByDistrictId(district);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<OperationalSite> findById(@PathVariable Long id) {
		Optional<OperationalSite> foundOpSite = operationalSiteRepository.findById(id);
		
		return foundOpSite.isPresent() ? ResponseEntity.ok(foundOpSite.get()) : ResponseEntity.notFound().build();
	}
	
	@PostMapping
	public ResponseEntity<OperationalSite> create(@Valid @RequestBody OperationalSite operationalSite,
			          HttpServletResponse response) {
		OperationalSite savedOpSite = operationalSiteRepository.save(operationalSite);
		
		publisher.publishEvent(new CreatedResourceEvent(this, response, savedOpSite.getId()));
		
		return ResponseEntity.status(HttpStatus.CREATED).body(savedOpSite);
		
	}
	
	

}
