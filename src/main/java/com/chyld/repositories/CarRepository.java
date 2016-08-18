package com.chyld.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;
import com.chyld.models.Car;

public interface CarRepository extends PagingAndSortingRepository<Car, Integer> {
}