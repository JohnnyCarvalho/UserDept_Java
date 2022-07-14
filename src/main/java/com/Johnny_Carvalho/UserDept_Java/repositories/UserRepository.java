package com.Johnny_Carvalho.UserDept_Java.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Johnny_Carvalho.UserDept_Java.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
