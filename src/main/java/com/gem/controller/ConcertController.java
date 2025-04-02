package com.gem.controller;

import com.gem.common.Result;
import com.gem.entity.Concert;
import com.gem.service.ConcertService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/concert")
public class ConcertController {
    @Autowired
    private ConcertService concertService;

    @GetMapping("/all")
    public Result getAllConcerts(){
        List<Concert> concertList = concertService.getAllConcerts();
        return Result.success(concertList);
    }

    @PostMapping("/add")
    public Result addConcert(@RequestBody Concert concert){
        concertService.addConcert(concert);
        return Result.success();
    }
}
