package com.hackerrank.github.service;

import java.util.List;
import java.util.Optional;

import com.hackerrank.github.model.Actor;
import com.hackerrank.github.model.Event;
import com.hackerrank.github.model.Repo;

public interface EventService {
	
	void deleteAll();

	Long addNewEvent(Event event);

	List<Event> getAllEvents();

	List<Event> getEventsByActorID(long ID);
	
	Optional<Event> getEventByEventID(long eventID);

	List<Event> getEventsByRepoID(long repoID);
}
