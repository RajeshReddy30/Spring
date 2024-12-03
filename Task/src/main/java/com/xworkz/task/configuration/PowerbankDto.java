package com.xworkz.task.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class PowerbankDto {
    @Value("10000")
    private int capacity;

    @Value("Lithium")
    private String batteryType;

    @Value("Black")
    private String color;

    @Value("2")
    private int usbPorts;

    @Value("Fast Charging")
    private String feature;

    @Value("2024")
    private int yearMade;

    @Value("Portable")
    private String design;
}

