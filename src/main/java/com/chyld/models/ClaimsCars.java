//package com.chyld.models;
//
//import javax.persistence.*;
//
///**
// * Created by localadmin on 8/18/16.
// */
//@Entity
//@Table(name = "claims_cars")
//public class ClaimsCars {
//    private int claimId;
//    private int carId;
//
//    public ClaimsCars(int claimId, int carId) {
//        this.claimId = claimId;
//        this.carId = carId;
//    }
//    public ClaimsCars() {
//    }
//
//    @Id
//    @Column(name = "claim_id", columnDefinition = "int")
//    public int getClaimId() {
//        return claimId;
//    }
//    public void setClaimId(int claimId) {
//        this.claimId = claimId;
//    }
//
//    @Id
//    @Column(name = "car_id", columnDefinition = "int")
//    public int getCarId() {
//        return carId;
//    }
//    public void setCarId(int carId) {
//        this.carId = carId;
//    }
//}
