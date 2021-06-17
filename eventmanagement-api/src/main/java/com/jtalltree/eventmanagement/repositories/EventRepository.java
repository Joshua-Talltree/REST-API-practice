package com.jtalltree.eventmanagement.repositories;

import com.jtalltree.eventmanagement.entities.Event;
import org.springframework.data.repository.CrudRepository;

public interface EventRepository extends CrudRepository<Event, Long> {
}

