package com.dealership.repository;

import com.dealership.domain.manufacturer.Manufacturer;

public interface IManufacturerRepository {
    public Manufacturer create(Manufacturer manufacturer);
}
