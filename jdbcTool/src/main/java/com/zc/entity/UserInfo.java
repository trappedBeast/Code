package com.zc.entity;

public class UserInfo {
    private String userNo;

    private String userName;

    private String userType;

    public String getUserNo() {
        return userNo;
    }

    public void setUserNo(String userNo) {
        this.userNo = userNo == null ? null : userNo.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType == null ? null : userType.trim();
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "userNo='" + userNo + '\'' +
                ", userName='" + userName + '\'' +
                ", userType='" + userType + '\'' +
                '}';
    }
}