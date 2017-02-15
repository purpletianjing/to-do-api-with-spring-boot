package sql_session;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class SqlSessionBuilder {
    public static SqlSession getSqlSession() throws IOException {
        String resource = "mybatis/mybatis-config.xml";
        InputStream inputStream = SqlSessionBuilder.class.getClassLoader().getResourceAsStream(resource);

        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        SqlSession session = sessionFactory.openSession(true);
        return session;
    }
}
