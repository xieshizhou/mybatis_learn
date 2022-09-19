package com.xie.map;

import com.xie.pojo.Blog;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BlogMapper {
    //插入数据
    public int addBook(Blog blog);
    public List<Blog> getBlogByTitle(@Param("title") String title);
}
