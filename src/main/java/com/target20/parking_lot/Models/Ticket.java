package com.target20.parking_lot.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@ToString
public class Ticket extends  BaseModel {
    private Date entryTime;
    @ManyToOne
    private Vehicle vehicle;
    @ManyToOne
    private ParkingSlot parkingSlot;
    @ManyToOne
    private Gate gate;

    @OneToMany
    private List<AddOnServiceOrder> addOnServiceList;
    private boolean vehicleChargingRequired;
    @OneToOne
    private ChargerDetails chargerDetails;

}
