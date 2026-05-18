package com.target20.parking_lot.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
public class Bill extends BaseModel {
     private BillStatus billStatus;
     private double billAmount;
     @OneToOne
     private Ticket ticket;
}
