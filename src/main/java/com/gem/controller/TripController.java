package com.gem.controller;

import com.gem.common.Result;
import com.gem.entity.Trip;
import com.gem.service.TripService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TripController {
    @Autowired
    private TripService tripService;

    @GetMapping("/trip")
    public Result getAllTrips(){
        List<Trip> tripList = tripService.getAllTrips();
        return Result.success(tripList);
    }
}
