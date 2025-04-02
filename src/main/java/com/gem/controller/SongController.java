package com.gem.controller;

import com.gem.common.Result;
import com.gem.entity.Song;
import com.gem.service.SongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/song")
public class SongController {
    @Autowired
    private SongService songService;

    @GetMapping("/all")
    public Result getAllSongs(){
        List<Song> songList = songService.getAllSongs();
        return Result.success(songList);
    }

    @PostMapping("/add")
    public Result addSong(@RequestBody Song song){
        songService.addSong(song);
        return Result.success();
    }
}
