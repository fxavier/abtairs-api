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
import com.xavier.abtairsapi.model.TeamLeader;
import com.xavier.abtairsapi.repository.TeamLeaderRepository;

@CrossOrigin(maxAge = 10, origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/teamleaders")
public class TeamLeaderResource {
	
	@Autowired
	private TeamLeaderRepository teamLeaderRepository;
	
	@Autowired
	private ApplicationEventPublisher publisher;
	
	@GetMapping
	public List<TeamLeader> findAll() {
		return teamLeaderRepository.findAll();
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<TeamLeader> findBayId(@PathVariable Long id) {
		Optional<TeamLeader> foundTeamLeader = teamLeaderRepository.findById(id);
		return foundTeamLeader.isPresent() ? ResponseEntity.ok(foundTeamLeader.get())
				                           : ResponseEntity.notFound().build();
	}
	
	@PostMapping
	public ResponseEntity<TeamLeader> create(@Valid @RequestBody TeamLeader teamLeader
			, HttpServletResponse response) {
		TeamLeader savedTeamLeader = teamLeaderRepository.save(teamLeader);
		publisher.publishEvent(new CreatedResourceEvent(this, response, savedTeamLeader.getId()));
		
		return ResponseEntity.status(HttpStatus.CREATED).body(savedTeamLeader);
	}

}
