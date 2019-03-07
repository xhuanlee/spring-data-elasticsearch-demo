package com.love.elasticsearchdemo.elasticsearchdemo.repository;

import com.love.elasticsearchdemo.elasticsearchdemo.entity.City;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;
import java.util.Optional;

public interface CityRepository extends ElasticsearchRepository<City, Long> {

    public City save(City city);

    public Optional<City> findById(Long id);

    public List<City> findCitiesByDescriptionContainsAndPopulationIsGreaterThan(String description, Long population);

}
