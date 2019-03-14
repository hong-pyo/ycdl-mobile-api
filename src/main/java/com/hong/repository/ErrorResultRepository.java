package com.hong.repository;

import com.hong.common.ErrorResultDto;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by hong2 on 15/03/2019
 * Time : 12:42 AM
 */

public interface ErrorResultRepository extends JpaRepository<ErrorResultDto, Long> {
}
