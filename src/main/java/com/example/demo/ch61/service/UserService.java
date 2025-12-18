package com.example.demo.ch61.service;
import com.example.demo.ch61.entity.MyUser;
import org.apache.catalina.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
	public void saveAll();
	public List<MyUser> findAll();
	public MyUser findByUname(String uname);
	public List<MyUser> findByUnameLike(String uname);
	public MyUser getOne(int id);
    // Repository


    // Service
    public MyUser findFirstByUname(String uname);
}
