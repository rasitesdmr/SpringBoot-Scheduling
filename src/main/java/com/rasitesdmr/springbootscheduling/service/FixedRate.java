package com.rasitesdmr.springbootscheduling.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Random;
import java.util.logging.Logger;

@Service
public class FixedRate {


    static final Logger LOGGER = Logger.getLogger(FixedDelay.class.getName());

    private double number;

    public Double getRandomNumber() {
        return number;
    }

/*
    fixedRate = 2000 :
    - Metodu her 2 saniyedi bir calıştır.
    - Rate de dikkat etmemiz gereken yer aşağıdaki örnek üzerinden anlatırsam, metot başlıyor bitiyor 4 saniye sonra
    tekrar başlıyor.
    - Normalde böyle, ama Rate kullanırsak metod'un 4 saniye uykusunu beklemeden 2 saniyede bir yeni metodu başlatıyor.
    - Kısacası delay metodun bitmesini bekliyor , rate beklemeden verilen saniyede yeni metoda geçiyor.
*/
    @Scheduled(fixedRate = 2000) // iki saniye delay
    @Async
    public void randomNumber2() throws InterruptedException {
        Random random = new Random();
        number = random.nextDouble() *100;
        LOGGER.info("Local Time : " + LocalDateTime.now().toLocalTime()+ ", Random Number : " + number);
        Thread.sleep(4000);  // 4 saniye uyku
    }
/*
    @Async :
    - Ayrıca yönteme bir @Async ek açıklaması ve yapılandırma sınıfına @EnableAsync ekledik.
    - Bir yöntem üzerindeki @Async ek açıklaması, ayrı bir iş parçacığında yürütülmesine izin verir.
    - Bunun bir sonucu olarak, yöntemin önceki yürütmesi sabit hız aralığından daha uzun sürdüğünde,
      önceki çağrı hala yürütülüyor olsa bile bir yöntemin sonraki çağrılması tetiklenir.
    - Bu, yöntemin birden çok uygulamasının çakışan zaman aralığı için paralel olarak çalışmasına izin verecektir.
*/

}
