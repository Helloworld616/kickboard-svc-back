package com.lgcns.tct.service;

import com.lgcns.tct.dto.UsedataDto;
import com.lgcns.tct.dto.UsedListDto;
import com.lgcns.tct.mapper.UsedataMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.*;

@Service
@RequiredArgsConstructor
public class UseddataServiceimpl implements UsedataService {

    @Autowired
    private final UsedataMapper usedataMapper;
    
	@Override
	public UsedataDto getUseData(String user_no, String start_dt){

        UsedataDto result = usedataMapper.getUseData(user_no, start_dt);

		return result;
	}

    
	@Override
	public Map<String, Object> getUsedList(String user_no, String start_dt){
				/* 1. 리스트 형식으로 데이터 받아오기
				 * 2. HashMap 생성
				 * 3. HashMap에 받아온 리스트 데이터 넣기 (put)
				 */
 
				 
				//🔨🔨이곳에 코드를 작성하세요!
				List<UsedListDto> list = usedataMapper.getUsedList(user_no, start_dt);
				// System.out.println("####### list ########");
				// System.out.println(list.get(0));

        Map<String, Object> result = new HashMap<>();
				result.put("list", list);
				// System.out.println("####### result ########");
				// System.out.println(result);

		return result;
	}
}
