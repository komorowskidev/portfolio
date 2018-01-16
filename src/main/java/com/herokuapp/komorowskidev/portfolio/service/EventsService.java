package com.herokuapp.komorowskidev.portfolio.service;

import com.herokuapp.komorowskidev.portfolio.entity.Events;

/**
 * interfejs serwisu zdarzeń
 * @author Krzysztof Świerkosz-Komorowski komorowskidev@gmail.com
 *
 */
public interface EventsService {

	public Iterable<Events> getEvents();
	
	public Events getEvent(long id);

	public void saveEvent(Events event);
	
	public void delete(long id);
}
