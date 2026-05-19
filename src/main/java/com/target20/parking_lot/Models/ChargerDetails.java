package com.target20.parking_lot.Models;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
public class ChargerDetails extends BaseModel {
    private String otp;
    private double currentUnits;
}
