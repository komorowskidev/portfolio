package com.herokuapp.komorowskidev.portfolio.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.herokuapp.komorowskidev.portfolio.entity.Events;
import com.herokuapp.komorowskidev.portfolio.repository.EventsRepository;

/**
 * serwis zdarzeń
 * 
 * @author Krzysztof Świerkosz-Komorowski komorowskidev@gmail.com
 *
 */
@Service
public class EventsServiceImpl implements EventsService {

	@Autowired
	EventsRepository eventsRepository;
	
	@Override
	public Iterable<Events> getEvents() {
		Iterable<Events> events = eventsRepository.findAll(new Sort(Sort.Direction.DESC, "date"));
		return events;
	}
	
	@Override
	public void saveEvent(Events event) {
		eventsRepository.save(event);
	}

	@Override
	public Events getEvent(long id) {
		return eventsRepository.findOne(id);
	}

	@Override
	public void delete(long id) {
		eventsRepository.delete(id);
	}

}
