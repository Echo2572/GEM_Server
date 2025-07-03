package com.gem.controller;

import com.gem.common.Result;
import com.gem.entity.Album;
import com.gem.service.AlbumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/album")
public class AlbumController {
    @Autowired
    private AlbumService albumService;

    @GetMapping("/all")
    public Result getAllAlbums() {
        List<Album> albumList = albumService.getAllAlbums();
        return Result.success(albumList);
    }

    @PostMapping("/add")
    public Result addAlbum(@RequestBody Album album){
        albumService.addAlbum(album);
        return Result.success();
    }

    @DeleteMapping("/delete/{id}")
    public Result deleteById(@PathVariable Integer id){
        albumService.deleteById(id);
        return Result.success();
    }

    @PostMapping("/update/{id}")
    public Result updateAlbum(@PathVariable Integer id, @RequestBody Album album) {
        album.setId(id);
        albumService.updateAlbum(album);
        return Result.success();
    }
}
