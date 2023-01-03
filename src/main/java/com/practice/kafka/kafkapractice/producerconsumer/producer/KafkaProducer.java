package com.practice.kafka.kafkapractice.producerconsumer.producer;

import com.practice.kafka.kafkapractice.producerconsumer.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducer {


    @Autowired
    private KafkaTemplate<String, User> kafkaTemplate;

    public String publish(User user){
        try {
            kafkaTemplate.send("test", user);
            return "success";
        }catch (Exception e){
            return "failure";
        }

    }
}
