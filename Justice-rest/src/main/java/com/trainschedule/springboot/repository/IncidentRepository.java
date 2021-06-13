package com.trainschedule.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.trainschedule.springboot.model.Incident;

public interface IncidentRepository extends JpaRepository<Incident, Long> {

}
