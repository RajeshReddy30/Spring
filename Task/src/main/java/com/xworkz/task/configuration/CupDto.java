package com.xworkz.task.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class CupDto {
    @Value("Ceramic")
    private String material;

    @Value("250")
    private int capacity;

    @Value("White")
    private String color;

    @Value("Simple")
    private String design;

    @Value("Dishwasher Safe")
    private String features;

    @Value("Tea")
    private String type;

    @Value("2023")
    private int yearMade;
}
