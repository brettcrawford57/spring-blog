package com.codeup.springblog;

import org.springframework.data.jpa.repository.JpaRepository;
import com.codeup.springblog.Post;

public interface PostRepository extends JpaRepository<Post, Long> {

    Post findById(long id);

    Post findByTitle(String title);
}
