package com.example.myrestfulservices.user;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


import static javax.persistence.FetchType.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Post {
    @Id
    @GeneratedValue
    private Integer id;

    private String description;


    //post입장에서 user는 다대일
    // User : Post -> 1: (0~N) Main[Parent] = User , Sub{Child] = post
    @ManyToOne(fetch = LAZY)
    @JsonIgnore  //외부에 데이터를 공개 하지 않는다.
    private User user;

}
