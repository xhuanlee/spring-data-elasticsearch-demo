package com.love.elasticsearchdemo.elasticsearchdemo.service;

import com.love.elasticsearchdemo.elasticsearchdemo.entity.City;
import com.love.elasticsearchdemo.elasticsearchdemo.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CityService {

    @Autowired
    CityRepository cityRepository;

    public City save(City city) {
        return cityRepository.save(city);
    }

    public City findById(Long id) {
        Optional<City> optionalCity = cityRepository.findById(id);
        if (optionalCity.isPresent()) {
            return optionalCity.get();
        }

        return null;
    }

    public List<City> query(String description, Long population) {
        return cityRepository.findCitiesByDescriptionContainsAndPopulationIsGreaterThan(description, population);
    }

}
