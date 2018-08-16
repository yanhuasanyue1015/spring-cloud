package com.example.kafka.producer;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProducerController {
    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    @RequestMapping("/send")
    public String send(@RequestParam("mes") String mes) {
        kafkaTemplate.send("test", mes);
        System.out.println("Message: " + mes + " sent to topic: " +"test");
        return "信息发送过去";
    }


    @KafkaListener(topics = "test")
    public void receiveTopic1(ConsumerRecord<?, ?> consumerRecord) {
        System.out.println(consumerRecord.value());
    }

}
