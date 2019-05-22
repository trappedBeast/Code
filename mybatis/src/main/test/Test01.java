import com.zc.entity.UserInfo;
import com.zc.mappers.UserInfoMapper;
import com.zc.tool.SqlSessionFactoryUtil;
import junit.framework.TestCase;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

/**
 * @ClassName Test
 * @Auther trappedBeast
 * @Date 2019/4/28 16:04
 * @Version 1.0
 * @Description TODO
 **/
public class Test01 extends TestCase {
    @Test
    public void test01(){
        System.out.println("hello world");
    }


    @Test
    public void test02(){
        SqlSession sqlSession = SqlSessionFactoryUtil.getSqlSession();
        System.out.println(sqlSession);
        UserInfoMapper userInfoMapper=sqlSession.getMapper(UserInfoMapper.class);
        UserInfo userInfo=new UserInfo();
        userInfo.setUserNo("213123");
        userInfo.setUserName("123");
        userInfoMapper.insert(userInfo);
        sqlSession.commit();
    }
}
    