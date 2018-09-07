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
import org.springframework.web.bind.annotation.RestController;

import com.xavier.abtairsapi.event.CreatedResourceEvent;
import com.xavier.abtairsapi.model.District;
import com.xavier.abtairsapi.repository.DistrictRepository;

@CrossOrigin( maxAge = 10, origins = {"*"})
@RestController
@RequestMapping("/districts")
public class DistrictResource {
	
	@Autowired
	private DistrictRepository districtRepository;
	
	@Autowired
	private ApplicationEventPublisher publisher;
	
	@GetMapping
	public List<District> listAll() {
		return districtRepository.findAll();
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<District> findById(@PathVariable Long id) {
		Optional<District> foundDistrict = districtRepository.findById(id);
		
		return foundDistrict.isPresent() ? ResponseEntity.ok(foundDistrict.get()) : ResponseEntity.notFound().build();
	}
	
	@PostMapping
	public ResponseEntity<District> create(@Valid @RequestBody District district, HttpServletResponse response) {
		District savedDistrict = districtRepository.save(district);
		
		publisher.publishEvent(new CreatedResourceEvent(this, response, savedDistrict.getId()));
		
		return ResponseEntity.status(HttpStatus.CREATED).body(savedDistrict);
	}

}
