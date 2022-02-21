package com.example.myrestfulservices.user;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Past;
import javax.validation.constraints.Size;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
//@JsonIgnoreProperties(value={"password", "ssn"})
//@JsonFilter("UserInfo") <-- 어드민에서 필터를 쓰기 위해 사용했다
public class User {
    private Integer id;

    @Size(min=2, message = "Name은 2글자 이상 입력해 주세요") //사이즈 제약
    private String name;

    @Past // 미래 데이터는 올 수 없다
    private Date joinDate;


    private String password;

    //@JsonIgnore
    private String ssn;
}
