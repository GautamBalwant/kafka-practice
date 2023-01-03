package com.practice.kafka.kafkapractice.producerconsumer;

import com.practice.kafka.kafkapractice.producerconsumer.model.User;
import com.practice.kafka.kafkapractice.producerconsumer.producer.KafkaProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/kafka")
public class KafkaRestController {

    @Autowired
    private KafkaProducer kafkaProducer;

    @PostMapping("/publish")
    public String publishMessage(@RequestBody User user){


       return  kafkaProducer.publish(user);
    }
}
