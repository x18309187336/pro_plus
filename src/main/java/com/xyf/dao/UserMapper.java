package com.xyf.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xyf.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface UserMapper extends BaseMapper<User> {



    List<User> findUsers();



}
