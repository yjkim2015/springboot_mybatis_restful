package com.example.myrestfulservices;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor // 모든 생성자를 만들어 준다.
@NoArgsConstructor // 디폴트 생성자 만들기
public class HelloWorldBean {
//lombok
    private String message;
}
