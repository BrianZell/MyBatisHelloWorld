package com.example;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

/**
 * Created by bzell on 5/3/2016.kk
 */
public class program {
    public static void main(String[] args) {

        try {
            String resource = "com/example/mybatis-config.xml";
            InputStream inputStream = Resources.getResourceAsStream(resource);
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

            SqlSession session = sqlSessionFactory.openSession();
            try {
                Customer customer = session.selectOne("com.example.selectCustomer", 5);
                System.out.println(customer.toString());
            } finally {
                session.close();
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
