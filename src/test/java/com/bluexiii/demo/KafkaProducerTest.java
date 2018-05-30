package com.bluexiii.demo;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class KafkaProducerTest {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    private ObjectMapper om = new ObjectMapper();

    @Test
    public void producerTest() {
        LoggingDTO loggingDTO = new LoggingDTO();
        loggingDTO.setRequestBody("123");
        loggingDTO.setMethod("POST");
        String loggingString = "";
        try {
            loggingString = om.writeValueAsString(loggingDTO);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        System.out.println(loggingString);
        kafkaTemplate.sendDefault(loggingString);
    }}
