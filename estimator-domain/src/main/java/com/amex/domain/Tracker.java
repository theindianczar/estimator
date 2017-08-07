package com.amex.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Tracker {
	
	@Id
	@GeneratedValue(strategy= GenerationType.SEQUENCE)
	private long id;

	private String trackerId;
	private String trackerDescription;
	private long estimate;
	private String assumptions;
	
	protected Tracker() {}
	
	public Tracker(String trackerId,String trackerDescription) {
		this.trackerId=trackerId;
		this.trackerDescription=trackerDescription;
	}

	public long getId() {
		return id;
	}

	public String getTrackerId() {
		return trackerId;
	}

	public String getTrackerDescription() {
		return trackerDescription;
	}

	public long getEstimate() {
		return estimate;
	}

	public String getAssumptions() {
		return assumptions;
	}
}
		