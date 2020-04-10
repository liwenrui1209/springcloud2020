package com.atguigu.springcloud.entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

//注解在类，生成setter/getter、equals、canEqual、hashCode、toString方法
//如为final属性，则不会为该属性生成setter方法
@Data
//注解在类，生成包含类中所有字段的构造方法
@AllArgsConstructor
//注解在类，生成无参的构造方法
@NoArgsConstructor
public class Payment implements Serializable {

    private Long id;
    private String serial;

}