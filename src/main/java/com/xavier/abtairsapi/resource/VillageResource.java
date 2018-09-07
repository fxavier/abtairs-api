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
import com.xavier.abtairsapi.model.Village;
import com.xavier.abtairsapi.repository.VillageRepository;

@CrossOrigin(maxAge = 10, origins = { "*" })
@RestController
@RequestMapping("/villages")
public class VillageResource {
	
	@Autowired
	private VillageRepository villageRepository;
	
	@Autowired
	private ApplicationEventPublisher publisher;
	
	@GetMapping(params = "all")
	public List<Village> findAll() {
		return villageRepository.findAll();
	}
	
	@GetMapping
	public List<Village> findByLocality(@RequestParam Long locality) {
		return villageRepository.findByLocalityId(locality);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Village> findById(@PathVariable Long id) {
		Optional<Village> foundVillage = villageRepository.findById(id);
		
		return foundVillage.isPresent() ? ResponseEntity.ok(foundVillage.get()) : ResponseEntity.notFound().build();
	}
	
	@PostMapping
	public ResponseEntity<Village> create(@Valid @RequestBody Village village, HttpServletResponse response) {
		Village savedVillage = villageRepository.save(village);
		
		publisher.publishEvent(new CreatedResourceEvent(this, response, savedVillage.getId()));
		
		return ResponseEntity.status(HttpStatus.CREATED).body(savedVillage);
	}

}
