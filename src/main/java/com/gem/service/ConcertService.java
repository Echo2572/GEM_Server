package com.gem.service;

import com.gem.entity.Concert;
import com.gem.mapper.ConcertMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConcertService {
    @Autowired
    private ConcertMapper concertMapper;

    public List<Concert> getAllConcerts(){
        return concertMapper.getAllConcerts();
    }

    public void addConcert(Concert concert){
        concertMapper.insert(concert);
    }

    public void deleteConcert(Integer id){
        concertMapper.deleteById(id);
    }

    public void updateConcert(Concert concert){
        concertMapper.updateConcert(concert);
    }
}
