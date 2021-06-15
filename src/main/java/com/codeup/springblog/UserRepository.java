package com.codeup.springblog;

import org.springframework.data.jpa.repository.JpaRepository;
import com.codeup.springblog.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
