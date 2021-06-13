package com.trainschedule.springboot.controller;

import com.trainschedule.springboot.model.Incident;
import com.trainschedule.springboot.service.IncidentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.util.List;

@RestController
public class IncidentController {

    @Autowired
    private IncidentService incidentService;

    @GetMapping("/incidents")
    public ResponseEntity<List<Incident>> getAllIncidents() {
        return ResponseEntity.ok().body(incidentService.getAllIncident());
    }

    @GetMapping("/incidents/{id}")
    public ResponseEntity<Incident> getIncidentById(@PathVariable long id) {
        return ResponseEntity.ok().body(incidentService.getIncidentById(id));
    }

    @PostMapping("/incidents")
    public ResponseEntity<Incident> createIncident(@RequestBody Incident incident) {
        return ResponseEntity.ok().body(this.incidentService.createIncident(incident));
    }

    @PutMapping("/incidents/{id}")
    public ResponseEntity<Incident> updateIncident(@PathVariable long id, @RequestBody Incident incident) throws ParseException {
        incident.setId(id);
        return ResponseEntity.ok().body(this.incidentService.updateIncident(incident));
    }

    @DeleteMapping("/incidents/{id}")
    public HttpStatus deleteIncident(@PathVariable long id) {
        this.incidentService.deleteIncident(id);
        return HttpStatus.OK;
    }
}
