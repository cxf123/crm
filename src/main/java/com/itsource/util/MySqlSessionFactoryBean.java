package com.itsource.util;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;

public class MySqlSessionFactoryBean extends SqlSessionFactoryBean {

    @Override
    protected SqlSessionFactory buildSqlSessionFactory(){
        try {
            return super.buildSqlSessionFactory();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
