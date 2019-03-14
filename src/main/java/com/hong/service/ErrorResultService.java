package com.hong.service;

import com.hong.common.ErrorResultDto;
import com.hong.repository.ErrorResultRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

/**
 * Created by hong2 on 15/03/2019
 * Time : 12:43 AM
 */

@Service
public class ErrorResultService {
    @Autowired
    private ErrorResultRepository errorResultRepository;

    public void update(ErrorResultDto e) {
        e.setCreateDate(LocalDateTime.now());
        errorResultRepository.save(e);
    }
}
