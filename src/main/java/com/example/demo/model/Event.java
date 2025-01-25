package com.example.demo.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "events")
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long eventId;

    @Column(nullable = false, length = 100)
    private String eventName;

    @Column(nullable = false)
    private LocalDateTime eventDate;

    @Column(length = 200)
    private String location;

    @Column(columnDefinition = "TEXT")
    private String description;

    private Integer volunteersNeeded;

    private Integer volunteersAssigned = 0;

	public Long getEventId() {
		return eventId;
	}

	public void setEventId(Long eventId) {
		this.eventId = eventId;
	}

	public String getEventName() {
		return eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	public LocalDateTime getEventDate() {
		return eventDate;
	}

	public void setEventDate(LocalDateTime eventDate) {
		this.eventDate = eventDate;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getVolunteersNeeded() {
		return volunteersNeeded;
	}

	public void setVolunteersNeeded(Integer volunteersNeeded) {
		this.volunteersNeeded = volunteersNeeded;
	}

	public Integer getVolunteersAssigned() {
		return volunteersAssigned;
	}

	public void setVolunteersAssigned(Integer volunteersAssigned) {
		this.volunteersAssigned = volunteersAssigned;
	}
    
    
}
