package com.gem.mapper;

import com.gem.entity.Trip;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TripMapper {
    public List<Trip> getAllTrips();
}
