package com.wqw.mybatis.util;

import com.wqw.mybatis.Test.TestDemo;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MybatisUtils {
    private static final String CORE_CONFIG_FILE = "mybatis-config.xml";
    private static final SqlSessionFactory sqlSessionFactory;

    static {
        sqlSessionFactory =  new SqlSessionFactoryBuilder().build(TestDemo.class.getClassLoader().getResourceAsStream(CORE_CONFIG_FILE));
    }

    public static SqlSession getSqlSession() {
        return sqlSessionFactory.openSession();
    }

    public static void close(SqlSession sqlSession) {
        if (sqlSession != null) sqlSession.close();
    }

}
