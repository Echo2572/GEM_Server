package com.gem.mapper;

import com.gem.entity.Trip;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TripMapper {
    List<Trip> getAllTrips();

    void insert(Trip trip);

    void deleteById(Integer id);

    void updateTrip(Trip trip);
}
