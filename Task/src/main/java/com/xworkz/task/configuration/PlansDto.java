package com.xworkz.task.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class PlansDto {
    @Value("House Plan")
    private String type;

    @Value("Architect")
    private String designer;

    @Value("2")
    private int floors;

    @Value("2000")
    private int squareFootage;

    @Value("Completed")
    private String status;

    @Value("Yes")
    private String approved;

    @Value("2024")
    private int yearCreated;
}

