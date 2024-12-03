package com.xworkz.task.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class RoadDto {
    @Value("Concrete")
    private String material;

    @Value("10")
    private double width;

    @Value("500")
    private int length;

    @Value("National Highway")
    private String type;

    @Value("Smooth")
    private String surface;

    @Value("Mumbai")
    private String location;

    @Value("2015")
    private int yearBuilt;
}
