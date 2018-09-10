package com.xavier.abtairsapi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.xavier.abtairsapi.model.SprayOperator;

public interface SprayOperatorRepository extends JpaRepository<SprayOperator, Long> {
 public List<SprayOperator> findByDistrictId(Long district);
}
