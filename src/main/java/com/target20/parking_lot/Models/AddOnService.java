package com.target20.parking_lot.Models;

public enum AddOnService {
    CAR_DETAILING("CarDetailing",23),
    CAR_CLEANING("CarCleaning",12);

    private final String addOnName;
    private final double addOnePrice;

    AddOnService(String addOnName, double addOnePrice) {
        this.addOnName = addOnName;
        this.addOnePrice = addOnePrice;
    }


}
