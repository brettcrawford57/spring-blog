package com.codeup.springblog.daos;

import org.springframework.data.jpa.repository.JpaRepository;
import com.codeup.springblog.models.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
