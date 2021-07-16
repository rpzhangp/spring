package com.rushuni.service.impl;

import com.rushuni.mapper.UserMapper;
import com.rushuni.mapper.impl.UserMapperImpl;
import com.rushuni.service.UserService;

import java.util.*;

/**
 * @author rushuni
 * @date 2021年07月15日 3:35 下午
 */
public class UserServiceImpl implements UserService {

    String userName;
    private UserMapper userMapper;

    private List mylist;
    private Properties properties;
    private int[] myarr;
    private Set myset;
    private Map mymap;

    public UserServiceImpl() {

    }

    public UserServiceImpl(String userName, UserMapperImpl userMapper) {
        this.userName = userName;
        this.userMapper = userMapper;
    }

    @Override
    public void query() {
        System.out.println(userName + " 查询业务进行中。。。");
        System.out.println("list=" + mylist);
        System.out.println("properties=" + properties);
        System.out.println("myarr=" + myarr);
        System.out.println("myset=" + myset);
        System.out.println("mymap=" + mymap);
        userMapper.query();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public UserMapper getUserMapper() {
        return userMapper;
    }

    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    public List getMylist() {
        return mylist;
    }

    public void setMylist(List mylist) {
        this.mylist = mylist;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public int[] getMyarr() {
        return myarr;
    }

    public void setMyarr(int[] myarr) {
        this.myarr = myarr;
    }

    public Set getMyset() {
        return myset;
    }

    public void setMyset(Set myset) {
        this.myset = myset;
    }

    public Map getMymap() {
        return mymap;
    }

    public void setMymap(Map mymap) {
        this.mymap = mymap;
    }
}
