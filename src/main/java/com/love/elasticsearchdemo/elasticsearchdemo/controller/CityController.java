package com.love.elasticsearchdemo.elasticsearchdemo.controller;

import com.love.elasticsearchdemo.elasticsearchdemo.entity.City;
import com.love.elasticsearchdemo.elasticsearchdemo.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CityController {

    @Autowired
    CityService cityService;

    @PostMapping("cities")
    public Object saveCity(@RequestBody City city) {
        return cityService.save(city);
    }

    @GetMapping("cities/{id}")
    public Object getCityById(@PathVariable Long id) {
        return cityService.findById(id);
    }

    @GetMapping("cities")
    public Object queryCities(@RequestParam String description, @RequestParam Long population) {
        return cityService.query(description, population);
    }
}
