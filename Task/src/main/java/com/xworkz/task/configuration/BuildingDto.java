package com.xworkz.task.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class BuildingDto {
    @Value("Skyscraper")
    private String type;

    @Value("Glass")
    private String material;

    @Value("100")
    private int floors;

    @Value("500")
    private int height;

    @Value("Modern")
    private String style;

    @Value("Bengaluru")
    private String location;

    @Value("2026")
    private int yearBuilt;
}

