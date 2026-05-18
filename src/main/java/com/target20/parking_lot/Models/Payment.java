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
public class Payment extends BaseModel {

    private PaymentStatus paymentStatus;
    @ManyToOne
    private Bill bill;

}
