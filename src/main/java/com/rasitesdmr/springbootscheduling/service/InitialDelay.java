package com.rasitesdmr.springbootscheduling.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Random;
import java.util.logging.Logger;

@Service
public class InitialDelay {

    static final Logger LOGGER = Logger.getLogger(FixedDelay.class.getName());

    private double number;

    public Double getRandomNumber() {
        return number;
    }

/*
    initialDelay = 5000 , fixedRate = 3000 ;
    - İlk metot 5 saniye sonra çalışacak
    - Ardından her 3 saniyede bir yeni metot oluşacak.
*/
    @Scheduled(initialDelay = 5000 , fixedRate = 3000)
    @Async
    public void randomNumber1() throws InterruptedException {
        Random random = new Random();
        number = random.nextDouble() * 100;
        LOGGER.info("Local Time : " + LocalDateTime.now().toLocalTime() + ", Random Number : " + number);
        Thread.sleep(2000);
    }

}
