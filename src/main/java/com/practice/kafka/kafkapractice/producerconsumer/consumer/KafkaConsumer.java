package com.practice.kafka.kafkapractice.producerconsumer.consumer;

import com.practice.kafka.kafkapractice.producerconsumer.model.User;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    @KafkaListener(topics= "test", groupId="group_id")
    public void consume(User user){
        System.out.println(user);

    }
}
