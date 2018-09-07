package com.xavier.abtairsapi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.xavier.abtairsapi.model.Village;

public interface VillageRepository extends JpaRepository<Village, Long> {
	public List<Village> findByLocalityId(Long locality);

}
