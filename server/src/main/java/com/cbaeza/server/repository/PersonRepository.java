package com.cbaeza.server.repository;

import org.springframework.data.repository.CrudRepository;
import com.cbaeza.server.model.Person;

import java.util.List;

/**
 * Created by cbaeza on 21/01/16.
 */
public interface PersonRepository extends CrudRepository<Person, Long> {

	List<Person> findByLastname(String lastname);
}
