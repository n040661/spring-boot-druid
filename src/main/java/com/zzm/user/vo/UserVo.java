package com.zzm.user.vo;

import lombok.Data;

import java.io.Serializable;

@Data
public class UserVo implements Serializable {

    private Integer id;
    private String name;
    private Integer age;
}
