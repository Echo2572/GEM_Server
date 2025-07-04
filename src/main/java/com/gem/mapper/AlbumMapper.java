package com.gem.mapper;

import com.gem.entity.Album;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AlbumMapper {
    List<Album> getAllAlbums();

    void insert(Album album);

    void deleteById(Integer id);

    void updateAlbum(Album album);
}
