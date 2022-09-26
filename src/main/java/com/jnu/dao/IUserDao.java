package com.jnu.dao;

import com.jnu.domain.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IUserDao
{
    void insertUser(User user);
//    void deleteUser(String userName);
//    List<User> queryAllUser();
    User queryUserByName(String userName);
}
