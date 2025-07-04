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

    public void addSong(Song song){
        songMapper.insert(song);
    }

    public void deleteSong(Integer id){
        songMapper.deleteById(id);
    }

    public void updateSong(Song song){
        songMapper.updateSong(song);
    }
}
