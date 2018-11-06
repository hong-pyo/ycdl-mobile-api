package com.hong.repository;

import com.hong.domain.Board;
import com.hong.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by hong2 on 2018. 10. 28.
 * Time : PM 11:24
 */

public interface BoardRepository extends JpaRepository<Board, Long> {
    Board findByUser(User user);

}
