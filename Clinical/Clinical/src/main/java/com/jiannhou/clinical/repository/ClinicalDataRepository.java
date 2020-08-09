package com.jiannhou.clinical.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jiannhou.clinical.model.ClinicalData;

public interface ClinicalDataRepository extends JpaRepository<ClinicalData, Integer> {

	List<ClinicalData> findByPatientIdAndComponentNameOrderByMeasuredDateTime(int patientId, String componentName);

}
