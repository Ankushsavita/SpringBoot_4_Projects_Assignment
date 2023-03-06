package com.geekster.instagram_app.dao;

import com.geekster.instagram_app.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
}
