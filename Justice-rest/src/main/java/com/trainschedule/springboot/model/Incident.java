package com.trainschedule.springboot.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "incidents")
public class Incident {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "description")
    private String description;

    @Column(name = "incidentCategory")
    private String incidentCategory;

    @Column(name = "location")
    private String location;

    @Column(name = "state")
    private String state;

    @Column(name = "city")
    private String city;

    @Column(name = "topic")
    private String topic;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getIncidentCategory() {
        return incidentCategory;
    }

    public void setIncidentCategory(String incidentCategory) {
        this.incidentCategory = incidentCategory;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

}
