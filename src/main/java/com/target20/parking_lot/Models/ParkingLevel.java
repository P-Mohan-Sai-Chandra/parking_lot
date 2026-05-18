package com.target20.parking_lot.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity
public class ParkingLevel extends BaseModel {

    private int level_no;
    private OperationalStatus status;
    @ManyToOne
    private ParkingLot parkingLot;
}
