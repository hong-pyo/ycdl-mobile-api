package com.hong.service;

import com.hong.domain.AlertMessage;
import com.hong.repository.AlertMessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by hong2 on 15/03/2019
 * Time : 1:19 AM
 */
@Service
public class AlertMessageService {
    @Autowired
    private AlertMessageRepository alertMessageRepository;

    public AlertMessage findByVersion(Double version) {
        AlertMessage alertMessage = alertMessageRepository.findByVersion(version);
        if (alertMessage == null) {
            alertMessage.setTitle("YCDL");
            alertMessage.setMessage("YCDL 을 이용해 주셔서 감사합니다. \n" +
                    "새로운 아이디어를 내주시면 감사하겠습니다. \n" +
                    "email : hong2_dev@naver.com");
            return alertMessage;
        } else {
            return alertMessage;
        }
    }
}
