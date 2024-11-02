package com.JwtSecurity.JwtSecurity.dao;

import com.JwtSecurity.JwtSecurity.model.User;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface UserRepo extends JpaRepository<User, Integer> {

    User findByUsername(String username);
}
