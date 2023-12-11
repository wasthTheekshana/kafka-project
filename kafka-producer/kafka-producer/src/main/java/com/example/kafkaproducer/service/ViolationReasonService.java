package com.example.kafkaproducer.service;

import com.example.kafkaproducer.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class ViolationReasonService {


    @Autowired
    private KafkaTemplate<String,Object> kafkaTemplate;

    @Value("${spring.kafka.topic.name}")
    private String topicName;


    public void sendMessage(User user){
        kafkaTemplate.send(topicName,user);
    }
}
