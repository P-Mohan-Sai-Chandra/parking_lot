package com.target20.parking_lot.Models;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
public class ChargingPoint extends  BaseModel {
    private int currentUnits;
    private OperationalStatus status;
    private ChargingPointStatus chargingStatus;
    private String currPassCode;
}
