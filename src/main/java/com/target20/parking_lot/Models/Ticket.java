package com.target20.parking_lot.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
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


    private List<AddOnService> addOnServiceList;
    private String chargingPointPassCode;

}
