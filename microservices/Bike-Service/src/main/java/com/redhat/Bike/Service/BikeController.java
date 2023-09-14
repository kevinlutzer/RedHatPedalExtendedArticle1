package com.redhat.Bike.Service;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class BikeController {
    @Autowired
    BikeService bikeService;

    // RETRIEVE ALL BIKES
    @GetMapping("/api/bikes")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<List<Bike>> purchase() {
        return ResponseEntity.ok(bikeService.retrieveBikes());
    }

    // CREATE A BIKE
    @PostMapping("/api/bike/insert-bike")
    @ResponseStatus(HttpStatus.OK)
    public void postBikeAd(@RequestBody Bike bike) {
        bikeService.postBikeAd(bike);
    }
}
