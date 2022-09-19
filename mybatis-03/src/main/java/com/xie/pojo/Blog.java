package com.xie.pojo;

import com.oracle.webservices.internal.api.databinding.DatabindingMode;
import lombok.Data;

import java.util.Date;

@Data
public class Blog {
    private String id;
    private String title;
    private String author;
    private Date createTime;//属性与字段不一致
    private int views;

}
