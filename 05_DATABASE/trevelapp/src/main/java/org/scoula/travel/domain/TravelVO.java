package org.scoula.travel.domain;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
/*
* VO
* - 데이터 자체를 담는 객체
* - 주로 DB테이블의 한 행을 객체로 표현
*
* DTO
* - 계층간 데이터 전달만을 위해 사용하는 객체
* - 비지니스 로직에 필요한 필드만 담음
* */

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TravelVO {

    private Long no;
    private String district;
    private String title;
    private String description;
    private String address;
    private String phone;

    private List<TravelImageVO> images;
}
