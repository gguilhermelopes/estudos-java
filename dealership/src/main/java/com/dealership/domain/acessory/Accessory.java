package com.dealership.domain.acessory;

import com.dealership.domain.car.Car;
import jakarta.persistence.*;

@Entity
@Table(name = "ACCESSORY")
public class Accessory {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "description", nullable = false)
    private String description;

    @ManyToOne
    @JoinColumn(
            name = "CAR_ID",
            foreignKey = @ForeignKey(name= "fk_car_accessory"),
            referencedColumnName = "id",
            nullable = false
    )
    private Car car;

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }
}
