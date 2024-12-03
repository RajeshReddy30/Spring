package com.xworkz.task.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class ComputerDto {
    @Value("samsung")
    private String brand;

    @Value("15.6")
    private double screenSize;

    @Value("Intel Core i7")
    private String processor;

    @Value("16")
    private int ram;

    @Value("512")
    private int storage;

    @Value("Windows 10")
    private String operatingSystem;

    @Value("Black")
    private String color;
}

