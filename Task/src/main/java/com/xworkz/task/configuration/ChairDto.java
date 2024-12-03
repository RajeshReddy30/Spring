package com.xworkz.task.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class ChairDto {
    @Value("Wood")
    private String material;

    @Value("Modern")
    private String style;

    @Value("4")
    private int legs;

    @Value("Ergonomic")
    private String type;

    @Value("Brown")
    private String color;

    @Value("500")
    private int weightLimit;

    @Value("Comfortable")
    private String feature;
}
