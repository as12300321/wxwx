package com.myuuutime.mapper;


import com.myuuutime.entity.apUser;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface apusermapper {

   // @Insert("insert into apuser (username,uiphone,uemail,ucomment,ifappointment,insert_ts) values (#{username},#{uiphone},#{uemail},#{ucomment},#{ifappointment},#{insert_ts})")
    int addApUser(apUser record);
    int findOne();

}
