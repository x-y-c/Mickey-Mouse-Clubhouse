package com.xyc.todolist.repo;

import com.xyc.todolist.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User,Integer>{
    User  findByUsernameAndPasswordAndEnableIsTrue(String username,String password);

    User findByEmailAndEnableIsTrue(String email);
    Integer countByEmailAAndEnableIsTrue(String email);

    User findByEmailAndPassword(String email,String password);



}
