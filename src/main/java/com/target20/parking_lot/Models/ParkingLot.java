package com.target20.parking_lot.Models;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
public class ParkingLot extends  BaseModel {

    private String name;
    private String address;
    private OperationalStatus status;

}
