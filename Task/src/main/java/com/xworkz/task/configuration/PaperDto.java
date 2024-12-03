package com.xworkz.task.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class PaperDto {
    @Value("A4")
    private String size;

    @Value("80")
    private int weight;

    @Value("Recycled")
    private String type;

    @Value("White")
    private String color;

    @Value("100")
    private int sheetsPerPack;

    @Value("Smooth")
    private String texture;

    @Value("2023")
    private int manufacturingYear;
}
