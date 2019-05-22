import com.zc.dao.UserInfoDao;
import com.zc.entity.UserInfo;
import junit.framework.TestCase;
import org.junit.Test;

import java.util.List;

/**
 * @ClassName Test01
 * @Auther trappedBeast
 * @Date 2019/4/28 23:21
 * @Version 1.0
 * @Description TODO
 **/
public class Test01 extends TestCase {

    @Test
    public void test01(){
        System.out.println("111111111111111111");
    }


    @Test
    public void test02(){
        UserInfoDao userInfoDao=new UserInfoDao();
        List<UserInfo> userInfos = userInfoDao.selectAllUsers();
        System.out.println(userInfos);
    }


    public void test03(){
        UserInfo userInfo1=new UserInfo();
        UserInfo userInfo2=new UserInfo();
        userInfo1.setUserNo("zhengchao");
        userInfo2.setUserNo("zhengchaoniubi");
        UserInfo[] userInfos={userInfo1,userInfo2};

        UserInfoDao userInfoDao=new UserInfoDao();
        userInfoDao.insertUsers(userInfos);
    }


    public void test04(){
        String str="01";
        System.out.println(Integer.parseInt(str));
    }

    public void test05(){
        /*while (true){
            System.out.println("hello");
        }*/
    }


}
    