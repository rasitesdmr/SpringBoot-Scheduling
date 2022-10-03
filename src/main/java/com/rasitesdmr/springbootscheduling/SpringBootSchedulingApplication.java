package com.rasitesdmr.springbootscheduling;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
    @EnableScheduling :
    - Zamanlama varsayılan olarak etkin değildir.
    - Herhangi bir zamanlanmış iş eklemeden önce, @EnableScheduling ek açıklamasını ekleyerek zamanlamayı
      açık bir şekilde etkinleştirmemiz gerekir.
    - En iyi uygulama olarak, bu ek açıklamayı, planlanmış işlerimizin kodunu
      içeren bir paket altındaki özel bir sınıfa taşımalıyız.
*/
@SpringBootApplication
//@EnableScheduling
public class SpringBootSchedulingApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootSchedulingApplication.class, args);
    }

}
