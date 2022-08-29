package com.example.jenkinsawsproj;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RideController {
    private final Ride_Repository ride_rep;
    public RideController(Ride_Repository ride_rep){
        this.ride_rep = ride_rep;
    }

    @GetMapping("/allRides")
    List<Rides> allRides(){
        return ride_rep.findAll();
    }
}
