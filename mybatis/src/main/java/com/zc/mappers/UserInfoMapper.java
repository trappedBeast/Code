package com.zc.mappers;

import com.zc.entity.UserInfo;

public interface UserInfoMapper {
    int deleteByPrimaryKey(String userNo);

    int insert(UserInfo record);

    int insertSelective(UserInfo record);

    UserInfo selectByPrimaryKey(String userNo);

    int updateByPrimaryKeySelective(UserInfo record);

    int updateByPrimaryKey(UserInfo record);
}