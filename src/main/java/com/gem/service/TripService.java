package com.gem.service;

import com.gem.entity.Trip;
import com.gem.mapper.TripMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TripService {
    @Autowired
    private TripMapper tripMapper;

    public List<Trip> getAllTrips(){
        return tripMapper.getAllTrips();
    }
}
