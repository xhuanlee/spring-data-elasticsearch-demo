package com.love.elasticsearchdemo.elasticsearchdemo.entity;

import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName = "city", type = "_doc")
public class City {

    private Long id;

    private String name;

    private String nickName;

    private String description;

    private Long population;

    private String flower;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getPopulation() {
        return population;
    }

    public void setPopulation(Long population) {
        this.population = population;
    }

    public String getFlower() {
        return flower;
    }

    public void setFlower(String flower) {
        this.flower = flower;
    }
}
