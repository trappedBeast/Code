package com.demo2019.day0320;

import java.io.Serializable;

/**
 * @ClassName User
 * @Auther trappedBeast
 * @Date 2019/3/20 10:28
 * @Version 1.0
 * @Description TODO
 **/
public class User implements Serializable {
    private String userName;
    private transient String idCardNo;
    private transient static String  Country;

    public User() {
    }

    public User(String userName,String idCardNo) {
        this.userName = userName;
        this.idCardNo = idCardNo;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getIdCardNo() {
        return idCardNo;
    }

    public void setIdCardNo(String idCardNo) {
        this.idCardNo = idCardNo;
    }

    public static String getCountry() {
        return Country;
    }

    public static void setCountry(String country) {
        Country = country;
    }
}
    