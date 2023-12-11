package com.example.kafkaconsumer.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class PoliceTrafficService {

    @Value("${spring.kafka.topic.name}")
    private String topicName;


    @KafkaListener(topics = "${spring.kafka.topic.name}",groupId = "${spring.kafka.consumer.group-id}")
    public void consume(String message){
        System.out.println(message);
    }
}
