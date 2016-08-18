package com.chyld.models;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "claims")
public class Claim {
    private int claimId;
    private String date;
    private String time;
    private String url;
    private String location;

    public Claim() { // !!!!!!!!!!!!!!!!!!!!!!!!!!  hibernate needs a default constructor !!!!!!!!!!!!!!!!!!!!!!!
    }

    public Claim(int claimId, String date, String time, String url, String location) {
        this.claimId = claimId;
        this.date = date;
        this.time = time;
        this.url = url;
        this.location = location;
    }



    @Id
    @GeneratedValue
    @Column(name = "claim_id", columnDefinition = "int")
    public int getClaimId() {
        return claimId;
    }
    public void setClaimId(int claimId) {
        this.claimId = claimId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
