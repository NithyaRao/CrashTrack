package com.chyld.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;
import com.chyld.models.Person;

public interface PersonRepository extends PagingAndSortingRepository<Person, Integer> {
}
