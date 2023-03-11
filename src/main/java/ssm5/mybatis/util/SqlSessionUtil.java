package ssm5.mybatis.util;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class SqlSessionUtil {


public static SqlSession getSqlSession() {
	SqlSession sqlSession=null;
	try {
		InputStream is=Resources.getResourceAsStream("Mybatis-config.xml");
		//获取SqlSessionFactoryBulider对象
		SqlSessionFactoryBuilder sqlsessionFactoryBuilder=new SqlSessionFactoryBuilder();
		//获取SqlsessionFactory对象
		SqlSessionFactory sqlsessionFactory=sqlsessionFactoryBuilder.build(is);
		//获取SqlSession对象
		 sqlSession=sqlsessionFactory.openSession(true);
		
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return sqlSession;
}
}
