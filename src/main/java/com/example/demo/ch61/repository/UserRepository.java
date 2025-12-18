package com.example.demo.ch61.repository;
import java.util.List;
import java.util.Optional;

import com.example.demo.ch61.entity.MyUser;
import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 这里不需要使用@Repository注解数据访问层，
 * 因为Spring Boot自动配置了JpaRepository
 */
public interface UserRepository extends JpaRepository<MyUser, Integer>{
	public MyUser findByUname(String uname);
	public List<MyUser> findByUnameLike(String uname);

    Optional<MyUser> findFirstByUname(String uname);



}
