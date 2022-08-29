package com.example.jenkinsawsproj;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Rides {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private long ride_id;

private String ride_name;

    public Rides() {
    }

    private int ride_price;

    public Rides(String ride_name, int ride_price) {
        this.ride_name = ride_name;
        this.ride_price = ride_price;
    }

    public String getRide_name() {
        return ride_name;
    }

    public void setRide_name(String ride_name) {
        this.ride_name = ride_name;
    }

    public int getRide_price() {
        return ride_price;
    }

    public void setRide_price(int ride_price) {
        this.ride_price = ride_price;
    }
}
