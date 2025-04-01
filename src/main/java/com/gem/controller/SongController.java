package com.gem.controller;

import com.gem.common.Result;
import com.gem.entity.Song;
import com.gem.service.SongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SongController {
    @Autowired
    private SongService songService;

    @GetMapping("/song")
    public Result getAllSongs(){
        List<Song> songList = songService.getAllSongs();
        return Result.success(songList);
    }
}
