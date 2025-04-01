package com.gem.controller;

import com.gem.common.Result;
import com.gem.entity.Concert;
import com.gem.service.ConcertService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ConcertController {
    @Autowired
    private ConcertService concertService;

    @GetMapping("/concert")
    public Result getAllConcerts(){
        List<Concert> concertList = concertService.getAllConcerts();
        return Result.success(concertList);
    }
}
