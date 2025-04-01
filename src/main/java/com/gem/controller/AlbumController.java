package com.gem.controller;

import com.gem.common.Result;
import com.gem.entity.Album;
import com.gem.service.AlbumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AlbumController {
    @Autowired
    private AlbumService albumService;

    @GetMapping("/album")
    public Result getAllAlbums() {
        List<Album> albumList = albumService.getAllAlbums();
        return Result.success(albumList);
    }
}
