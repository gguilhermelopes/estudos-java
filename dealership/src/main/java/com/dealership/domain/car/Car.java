package com.dealership.domain.car;

import com.dealership.domain.acessory.Accessory;
import com.dealership.domain.manufacturer.Manufacturer;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "CAR")
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @ManyToOne
    @JoinColumn(
            name = "MANUFACTURER_ID",
            foreignKey = @ForeignKey(name= "fk_manufacturer_car"),
            referencedColumnName = "id",
            nullable = false
    )
    private Manufacturer manufacturer;

    @OneToMany(mappedBy = "car")
    private List<Accessory> accessories;

    public Car() {
        this.accessories = new ArrayList<>();
    }

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

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    public List<Accessory> getAccessories() {
        return accessories;
    }

    public void setAccessories(List<Accessory> accessories) {
        this.accessories = accessories;
    }

    public void addAccessories(Accessory accessory){
        this.accessories.add(accessory);
    }
}
