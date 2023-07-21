package com.lgcns.tct.mapper;

import com.lgcns.tct.dto.UsedataDto;

import com.lgcns.tct.dto.UsedListDto;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.*;

@Mapper
public interface UsedataMapper {    
    

    UsedataDto getUseData(@Param("user_no")String user_no, @Param("start_dt")String start_dt);


    /* 1. Impl에서 받는 형태랑 똑같은 형태로 선언
     * 2. 주어진 인자값 확인하여 잘 넣기
    */

    //🔨🔨이곳에 코드를 작성하세요!
    List<UsedListDto> getUsedList(@Param("user_no")String user_no, @Param("start_dt")String start_dt);

}




