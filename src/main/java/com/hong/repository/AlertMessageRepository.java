package com.hong.repository;

import com.hong.domain.AlertMessage;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by hong2 on 15/03/2019
 * Time : 1:17 AM
 */

public interface AlertMessageRepository extends JpaRepository<AlertMessage, Long> {
    AlertMessage findByVersion (Double version);
}
