package by.potapenko.database.entities;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
@Data
@Builder
@EqualsAndHashCode(of = "id")
public class Car {
    private Long id;
    private String model;
    private int year;
    private String engine;
    private String fuel;
    private String transmission;
    private double price;
}
