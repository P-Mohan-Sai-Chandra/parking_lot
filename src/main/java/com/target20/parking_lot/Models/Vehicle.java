package com.target20.parking_lot.Models;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
public class Vehicle extends BaseModel{
    private String vehicleNumber;
    private boolean isElectricVehicle;
}
