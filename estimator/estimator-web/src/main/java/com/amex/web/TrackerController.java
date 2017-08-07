package com.amex.web;


import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.amex.domain.Tracker;
import com.amex.persistence.TrackerRepository;


@RestController
public class TrackerController {

	private TrackerRepository trackerRepository;
	
	public TrackerController(TrackerRepository trackerRepository) {
		this.trackerRepository= trackerRepository;
	}
	
	@GetMapping("/trackers")
	public List<Tracker> getTrackers(){
		List<Tracker> trackers = this.trackerRepository.findAll();
		return trackers;
	}
	
	
}
