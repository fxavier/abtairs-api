package com.xavier.abtairsapi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.xavier.abtairsapi.model.OperationalSite;

public interface OperationalSiteRepository extends JpaRepository<OperationalSite, Long> {
	public List<OperationalSite> findByDistrictId(Long district);

}
