package com.xavier.abtairsapi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.xavier.abtairsapi.model.Locality;

public interface LocalityRepository extends JpaRepository<Locality, Long> {
  public List<Locality> findByOperationalSiteId(Long operationalSite);
}
