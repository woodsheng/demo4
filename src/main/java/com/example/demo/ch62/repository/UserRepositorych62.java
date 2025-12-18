package com.example.demo.ch62.repository;
import java.util.List;

import com.example.demo.ch62.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepositorych62 extends JpaRepository<User, Integer>{
	/**
	 * 根据权限id查询拥有该权限的用户（关联查询）
	 * 相当于JPQL语句：select u from User u inner join u.authorityList a where a.id = ?1
	 */
	public List<User> findByAuthorityList_id(int id);
	/**
	 * 根据权限名查询拥有该权限的用户（关联查询）
	 * 相当于JPQL语句：select u from User u inner join u.authorityList a where a.name = ?1
	 */
	public List<User> findByAuthorityList_name(String name);
}
