package com.trainschedule.springboot.service;

import java.text.ParseException;
import java.util.List;

import com.trainschedule.springboot.model.Incident;

public interface IncidentService {
	Incident createIncident(Incident incident);

	Incident updateIncident(Incident incident) throws ParseException;

	List<Incident> getAllIncident();

	Incident getIncidentById(long incidentId);

	void deleteIncident(long id);
}
