package cn.doreou.service.impl;

import cn.doreou.mapper.UserMapper;
import cn.doreou.model.User;
import cn.doreou.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    public void insertUser(User user){
        userMapper.insertUser(user);
    }

    public boolean isLogin(User user) {
        List<User> userList =userMapper.isLogin(user);
        if(userList.size()>0) {
            return true;
        }else {
            return false;
        }
    }

    public boolean queryById(String userid) {
        List<User> useridList=userMapper.queryById(userid);
        if(useridList.size()>0){
            return true;
        }else {
            return false;
        }
    }
    public List<User> getById(String userid){
        List<User> userList=userMapper.queryById(userid);
        if(userList.size()>0){
            return userList;
        }else {
            return null;
        }
    }
    public void updateInfoById(User user){
        userMapper.updateInfoById(user);
    }
    public void updateHeadPic(User user){
        userMapper.updateHeadPic(user);
    }
}
