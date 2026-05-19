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
public class AddOnServiceOrder extends BaseModel {

    @ManyToOne
    private AddOnService serviceOpted;
    private double orderedPrice;


}
