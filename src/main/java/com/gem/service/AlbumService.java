package com.gem.service;

import com.gem.entity.Album;
import com.gem.mapper.AlbumMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlbumService {
    @Autowired
    private AlbumMapper albumMapper;

    public List<Album> getAllAlbums(){
        return albumMapper.getAllAlbums();
    }

    public void addAlbum(Album album){
        albumMapper.insert(album);
    }
}
