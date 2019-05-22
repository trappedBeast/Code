package com.zc.dao;

import com.zc.entity.UserInfo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName UserInfoDao
 * @Auther trappedBeast
 * @Date 2019/4/28 10:27
 * @Version 1.0
 * @Description TODO
 **/
public class UserInfoDao extends BaseDao{


    public List<UserInfo> rsToList(ResultSet rs) throws SQLException {
        List<UserInfo> userInfos=new ArrayList<UserInfo>();
        while (rs.next()){
            UserInfo userInfo=new UserInfo();
            userInfo.setUserNo(rs.getString("USER_NO"));
            userInfo.setUserName(rs.getString("USER_NAME"));
            userInfo.setUserType(rs.getString("USER_TYPE"));
            userInfos.add(userInfo);
        }
        return userInfos;
    }


    public List<UserInfo> selectAllUsers(){
        String sql="select * from user_info";
        return executeQuery(sql,null);
    }

    public int insertUsers(UserInfo[] userInfos){
        String sql="insert into user_info (user_no,user_name,user_type) values(?,?,?);";
        return executeUpdate(sql,userInfos);

    }
}
    