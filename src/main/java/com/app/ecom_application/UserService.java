package com.app.ecom_application;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    private List<User> userList=new ArrayList<>();
    public List<User> fetchAllUsers(){
        return userList;
    }

    public List<User> addUsers(User user){
        userList.add(user);
        return userList;
    }
}
