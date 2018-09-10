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
import com.xavier.abtairsapi.model.DosTotals;
import com.xavier.abtairsapi.repository.DosTotalsRepository;

@CrossOrigin(maxAge = 10, origins = { "*"})
@RestController
@RequestMapping("/totals")
public class DosTotalsResource {

	@Autowired
	private DosTotalsRepository dosTotalsRepository;
	
	@Autowired
	private ApplicationEventPublisher publisher;
	
	@GetMapping
	public List<DosTotals> findAll() {
		return dosTotalsRepository.findAll();
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<DosTotals> findById(@PathVariable Long id) {
		Optional<DosTotals> totalFound = dosTotalsRepository.findById(id);
		
		return totalFound.isPresent() ? ResponseEntity.ok(totalFound.get())
				                      : ResponseEntity.notFound().build();
	}
	
	@PostMapping
	public ResponseEntity<DosTotals> create(@Valid @RequestBody DosTotals dosTotals, HttpServletResponse response) {
		DosTotals savedDosTotals = dosTotalsRepository.save(dosTotals);
		
		publisher.publishEvent(new CreatedResourceEvent(this, response, savedDosTotals.getId()));
		
		return ResponseEntity.status(HttpStatus.CREATED).body(savedDosTotals);
	}
}
