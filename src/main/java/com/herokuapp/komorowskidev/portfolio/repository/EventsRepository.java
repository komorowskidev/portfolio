package com.herokuapp.komorowskidev.portfolio.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.herokuapp.komorowskidev.portfolio.entity.Events;

/**
 * interfejs repozytorium z możliwością sortowania
 * 
 * @author Krzysztof Świerkosz-Komorowski komorowskidev@gmail.com
 *
 */
public interface EventsRepository extends PagingAndSortingRepository<Events, Long>{
	
}
