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
public class Gate extends  BaseModel{

    private GateType gateType;
    @ManyToOne
    private ParkingLot parkingLot;
    private OperationalStatus status;
    @ManyToOne
    private Operator operator;
}
