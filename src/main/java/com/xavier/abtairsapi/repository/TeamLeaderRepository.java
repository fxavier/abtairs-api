package com.xavier.abtairsapi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.xavier.abtairsapi.model.TeamLeader;

public interface TeamLeaderRepository extends JpaRepository<TeamLeader, Long> {
	public List<TeamLeader> findByDistrictId(Long district);

}
