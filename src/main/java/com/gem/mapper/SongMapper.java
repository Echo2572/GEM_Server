package com.gem.mapper;

import com.gem.entity.Song;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SongMapper {
    List<Song> getAllSongs();

    void insert(Song song);

    void deleteById(Integer id);

    void updateSong(Song song);
}
