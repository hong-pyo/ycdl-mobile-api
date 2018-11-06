package com.hong.repository;

import com.hong.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by hong2 on 2018. 10. 28.
 * Time : PM 11:23
 */

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}
