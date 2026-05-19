package com.target20.parking_lot.Models;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
public class AddOnService extends  BaseModel {

    @Enumerated(value = EnumType.STRING)
    private AddOnServiceName serviceName;
    private double servicePrice;
    private ServiceAvailability serviceStatus;

}
