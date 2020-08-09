package com.jiannhou.clinical.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jiannhou.clinical.model.Patient;

public interface PatientRepository extends JpaRepository<Patient, Integer> {
	List<Patient> findByFirstNameContainingOrLastNameContaining(String firstName, String lastName);
}
