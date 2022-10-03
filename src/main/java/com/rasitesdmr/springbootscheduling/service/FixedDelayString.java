package com.rasitesdmr.springbootscheduling.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Random;
import java.util.logging.Logger;

@Service
public class FixedDelayString {
    static final Logger LOGGER = Logger.getLogger(FixedDelay.class.getName());

    private double number;

    public Double getRandomNumber() {
        return number;
    }


    @Scheduled(fixedDelayString = "PT02S")
    public void randomNumber1() throws InterruptedException {
        Random random = new Random();
        number = random.nextDouble() * 100;
        LOGGER.info("Local Time : " + LocalDateTime.now().toLocalTime() + ", Random Number : " + number);
        Thread.sleep(4000);
    }
}
