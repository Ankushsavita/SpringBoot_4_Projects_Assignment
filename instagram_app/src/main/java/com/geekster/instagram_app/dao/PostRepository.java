package com.geekster.instagram_app.dao;

import com.geekster.instagram_app.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post,Integer> {
}
