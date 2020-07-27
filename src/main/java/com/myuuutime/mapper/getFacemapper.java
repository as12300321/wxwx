package com.myuuutime.mapper;


import com.myuuutime.entity.sPhoto;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface getFacemapper {
//    @Insert("INSERT INTO  savephoto (photo_org,photo_new,insert_ts) values(#{photo_org},#{photo_new},#{insert_ts}")
    int addFace(sPhoto sphoto);
}
