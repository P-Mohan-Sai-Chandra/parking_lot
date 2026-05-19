package com.target20.parking_lot.Models;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Entity
@Getter
@Setter
@ToString
public class ParkingSlot extends  BaseModel {

    private String slotNumber;
    @ElementCollection
    private List<VehicleType> supportedVehicles;
    private OperationalStatus status;
    private ParkingSlotStatus slotStatus;
    private ParkingSpotType spotType;
    private boolean isChargingAvailable;
    @ManyToOne
    private ParkingLevel level;
    @ManyToOne
    private ChargingPoint chargingPoint;
    @ManyToOne
    private Vehicle vehicle;



}
