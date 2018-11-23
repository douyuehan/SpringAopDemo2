package com.company.aop;

/**
 * Created by Administrator on 2018/11/23.
 */
public class UserManagerImpl implements UserManager {



    public void addUser(String username, String password) {
        //checkSecurity();
        System.out.println("===UserManager.addUser===");
    }



    public void delUser(int userId) {
        //checkSecurity();
        System.out.println("===UserManager.delUser===");
    }



    public String findUserById(int userId) {
        //checkSecurity();
        System.out.println("===UserManager.findUserById===");
        return  "张三";
    }



    public void modifyUser(int userId, String username, String password) {
        //checkSecurity();
        System.out.println("===UserManager.modifyUser===");
    }
}
