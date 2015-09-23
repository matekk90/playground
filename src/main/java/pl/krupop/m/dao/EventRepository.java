package pl.krupop.m.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import pl.krupop.m.entity.Event;

@Repository("eventRepository")
public interface EventRepository extends CrudRepository <Event, Long> {

}
