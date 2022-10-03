package com.rasitesdmr.springbootscheduling.service;


import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Random;
import java.util.logging.Logger;


@Service
public class FixedDelay {

    static final Logger LOGGER = Logger.getLogger(FixedDelay.class.getName());

    private double number;

    public Double getRandomNumber() {
        return number;
    }

/*
     fixedDelay = 2000 :
     - Metodumuzu 2 saniye gecikmeli başlat.
     - Delay'da dikkat edilmesi gereken yer metot bittikten sonra 2 saniye gecikmeli başlat demek .
*/
    @Scheduled(fixedDelay = 2000) // iki saniye delay
    public void randomNumber1() throws InterruptedException {
        Random random = new Random();
        number = random.nextDouble() * 100;
        LOGGER.info("Local Time : " + LocalDateTime.now().toLocalTime() + ", Random Number : " + number);
        Thread.sleep(2000);  // 2 saniye uyku
    }


}
