package com.target20.parking_lot.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
public class ParkingSlotVehicles extends  BaseModel {
    @ManyToOne
    private ParkingSlot parkingSlot;
    @ManyToOne
    private Vehicle vehicle;
}
