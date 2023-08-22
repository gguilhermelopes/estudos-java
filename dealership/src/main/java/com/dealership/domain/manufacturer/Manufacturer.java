package com.dealership.domain.manufacturer;

import com.dealership.domain.acessory.Accessory;
import com.dealership.domain.car.Car;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "MANUFACTURER")
public class Manufacturer {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @OneToMany(mappedBy = "manufacturer")
    private List<Car> cars;

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

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }
}
