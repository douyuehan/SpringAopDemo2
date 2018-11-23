package com.company.aop;

/**
 * Created by Administrator on 2018/11/23.
 */
public interface UserManager {
    public void addUser(String username,String password);
    public void delUser(int userId);
    public String findUserById(int userId);
    public void modifyUser(int userId,String username,String password);
}
