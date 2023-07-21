package com.lgcns.tct.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UsedListDto {
    // 명세 보고 똑같이 작성하기
    //🔨🔨이곳에 코드를 작성하세요!
    String use_no;
    int use_distance;
    int use_time;
    String use_start_dt;
    String use_end_dt;
    String pay_datetime;
    int card_pay;
    int point_pay;
}

