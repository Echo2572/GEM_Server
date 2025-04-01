package com.gem.mapper;

import com.gem.entity.Concert;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ConcertMapper {
    public List<Concert> getAllConcerts();
}
