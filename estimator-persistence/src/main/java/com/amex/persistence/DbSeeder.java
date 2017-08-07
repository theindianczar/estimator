package com.amex.persistence;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.amex.domain.Tracker;

@Component
public class DbSeeder implements CommandLineRunner{

	private TrackerRepository trackerRepository;
	
	public DbSeeder(TrackerRepository trackerRepository) {
		this.trackerRepository= trackerRepository;
	}
	
	@Override
	public void run(String... arg0) throws Exception {
		Tracker tracker1 = new Tracker("I-12098", "Japan NIVR Tracker");
		Tracker tracker2 = new Tracker("I-22570", "India NIVR Tracker");
		Tracker tracker3 = new Tracker("D-12345", "Australia NIVR Tracker");
		Tracker tracker4 = new Tracker("I-98345", "Singapore NIVR Tracker");
		Tracker tracker5 = new Tracker("D-76345", "HK NIVR Tracker");
		Tracker tracker6 = new Tracker("I-23456", "Germany NIVR Tracker");
		
		List<Tracker> trackers = new ArrayList<>();
		trackers.add(tracker1);
		trackers.add(tracker2);
		trackers.add(tracker3);
		trackers.add(tracker4);
		trackers.add(tracker5);
		trackers.add(tracker6);
		
		this.trackerRepository.save(trackers);
	}


}
	