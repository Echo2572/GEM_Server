package com.gem.service;

import com.gem.entity.Song;
import com.gem.mapper.SongMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SongService {
    @Autowired
    private SongMapper songMapper;

    public List<Song> getAllSongs(){
        return songMapper.getAllSongs();
    }
}
