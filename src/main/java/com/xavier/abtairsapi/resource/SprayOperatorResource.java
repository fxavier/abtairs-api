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
import com.xavier.abtairsapi.model.SprayOperator;
import com.xavier.abtairsapi.repository.SprayOperatorRepository;

@CrossOrigin(maxAge = 10, origins = { "*" })
@RestController
@RequestMapping("/sprayOperators")
public class SprayOperatorResource {
	
	@Autowired
	private SprayOperatorRepository sprayOperatorRepository;
	
	@Autowired
	private ApplicationEventPublisher publisher;
	
	@GetMapping
	public List<SprayOperator> findAll() {
		return sprayOperatorRepository.findAll();
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<SprayOperator> findById(@PathVariable Long id) {
		Optional<SprayOperator> foundSprayOperator = sprayOperatorRepository.findById(id);
		
		return foundSprayOperator.isPresent() ? ResponseEntity.ok(foundSprayOperator.get())
				                              : ResponseEntity.notFound().build();
	}
	
	@PostMapping
	public ResponseEntity<SprayOperator> create(@Valid @RequestBody SprayOperator sprayOperator
			    , HttpServletResponse response) {
	SprayOperator savedSprayOperator = sprayOperatorRepository.save(sprayOperator);
	
	publisher.publishEvent(new CreatedResourceEvent(this, response, savedSprayOperator.getId()));
	
	return ResponseEntity.status(HttpStatus.CREATED).body(savedSprayOperator);
	}
	
	

}
