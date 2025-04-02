package com.gem.controller;

import com.gem.common.Result;
import com.gem.entity.Trip;
import com.gem.service.TripService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("trip")
public class TripController {
    @Autowired
    private TripService tripService;

    @GetMapping("/all")
    public Result getAllTrips(){
        List<Trip> tripList = tripService.getAllTrips();
        return Result.success(tripList);
    }

    @PostMapping("/add")
    public Result addTrip(@RequestBody Trip trip){
        tripService.addTrip(trip);
        return Result.success();
    }
}
