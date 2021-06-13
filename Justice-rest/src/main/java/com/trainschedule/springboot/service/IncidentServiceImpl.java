package com.trainschedule.springboot.service;

import com.trainschedule.springboot.exception.ResourceNotFoundException;
import com.trainschedule.springboot.model.Incident;
import com.trainschedule.springboot.repository.IncidentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.text.ParseException;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class IncidentServiceImpl implements IncidentService {


    @Autowired
    private IncidentRepository incidentRepository;


    @Override
    public Incident createIncident(Incident incident) {
        return incidentRepository.save(incident);
    }

    @Override
    public Incident updateIncident(Incident incident) throws ParseException {
        Optional<Incident> trainDb = this.incidentRepository.findById(incident.getId());

        if (trainDb.isPresent()) {
            Incident incidentUpdate = trainDb.get();
            incidentUpdate.setId(incident.getId());
            incidentUpdate.setIncidentCategory(incident.getIncidentCategory());
            incidentUpdate.setDescription(incident.getDescription());
            incidentUpdate.setCity(incident.getCity());
            incidentUpdate.setState(incident.getState());
            incidentUpdate.setLocation(incident.getLocation());

            incidentRepository.save(incidentUpdate);
            return incidentUpdate;
        } else {
            throw new ResourceNotFoundException("Incident not found with id : " + incident.getId());
        }
    }

    @Override
    public List<Incident> getAllIncident() {
        return this.incidentRepository.findAll();
    }

    @Override
    public Incident getIncidentById(long incidentId) {

        Optional<Incident> trainDb = this.incidentRepository.findById(incidentId);

        if (trainDb.isPresent()) {
            return trainDb.get();
        } else {
            throw new ResourceNotFoundException("Incident not found with id : " + incidentId);
        }
    }

    @Override
    public void deleteIncident(long incidentId) {
        Optional<Incident> trainDb = this.incidentRepository.findById(incidentId);

        if (trainDb.isPresent()) {
            this.incidentRepository.delete(trainDb.get());
        } else {
            throw new ResourceNotFoundException("Incident not found with id : " + incidentId);
        }

    }

}
