package com.amex.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.amex.domain.Tracker;

@Repository
public interface TrackerRepository extends JpaRepository<Tracker, Long>{

}
