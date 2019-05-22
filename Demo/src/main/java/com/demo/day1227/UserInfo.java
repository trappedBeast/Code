package com.demo.day1227;

/**
 * @ClassName UserInfo
 * @Auther trappedBeast
 * @Date 2018/12/26 18:37
 * @Version 1.0
 * @Description TODO
 **/
public class UserInfo {
    private String userNo;
    private String userName;
    private String userType;

    public UserInfo() {
    }

    public UserInfo(String userNo,String userName,String userType) {
        this.userNo = userNo;
        this.userName = userName;
        this.userType = userType;
    }

    public String getUserNo() {
        return userNo;
    }

    public void setUserNo(String userNo) {
        this.userNo = userNo;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }
}
    