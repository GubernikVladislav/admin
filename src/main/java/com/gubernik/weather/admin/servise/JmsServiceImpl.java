package com.gubernik.weather.admin.servise;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

@Service
public class JmsServiceImpl implements JmsService {

    private final JmsTemplate jmsTemplate;

    @Autowired
    public JmsServiceImpl(JmsTemplate jmsTemplate) {
        this.jmsTemplate = jmsTemplate;
    }

    @Override
    public void sendJms(String message) {

    }
}
