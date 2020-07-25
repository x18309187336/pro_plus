package com.xyf;

import static org.junit.Assert.assertTrue;

import com.baomidou.mybatisplus.core.MybatisSqlSessionFactoryBuilder;
import com.baomidou.mybatisplus.extension.spring.MybatisSqlSessionFactoryBean;
import com.xyf.dao.UserMapper;
import com.xyf.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
       String res="mybatis-config.xml";
        try {
            InputStream inputStream = Resources.getResourceAsStream(res);
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
            SqlSession session = sqlSessionFactory.openSession();
            UserMapper userMapper = session.getMapper(UserMapper.class);
            List<User> users = userMapper.findUsers();
            for (User user:users){
                System.out.println(user);
            }


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void shouldPlus()
    {
       String res="mybatis-config.xml";
        try {
            InputStream inputStream = Resources.getResourceAsStream(res);
            SqlSessionFactory sqlSessionFactory = new MybatisSqlSessionFactoryBuilder().build(inputStream);
            SqlSession session = sqlSessionFactory.openSession();
            UserMapper userMapper = session.getMapper(UserMapper.class);
            List<User> users = userMapper.findUsers();
            for (User user:users){
                System.out.println(user);
            }


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void shouldPluss()
    {
       String res="mybatis-config.xml";
        try {
            InputStream inputStream = Resources.getResourceAsStream(res);
            SqlSessionFactory sqlSessionFactory = new MybatisSqlSessionFactoryBuilder().build(inputStream);
            SqlSession session = sqlSessionFactory.openSession();
            UserMapper userMapper = session.getMapper(UserMapper.class);
            List<User> users = userMapper.selectList(null);
            for (User user:users){
                System.out.println(user);
            }


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
