package com.rasitesdmr.springbootscheduling.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

/*
    @EnableScheduling :
    - Zamanlama artık yalnızca SchedulerConfig sınıfını uygulamaya yüklediğimizde etkinleştirilecek
      ve daha iyi modülerleştirme sağlanacak.

    @ConditionalOnProperty(name = "scheduler.enable", matchIfMissing = true) :
    - Testleri çalıştırırken zamanlamayı da devre dışı bırakmak istiyoruz.
    - Bunun için SchedulerConfig sınıfımıza bir koşul eklememiz gerekiyor.
    - Zamanlamayı kontrol etmek için kullanmak istediğimiz özelliğin adıyla @ConditionalOnProperty notunu eklemeliyiz.

    name = "scheduler.enable" :
    - Burada özellik adını Scheduler.enabled olarak belirledik.

     matchIfMissing = true :
    - Varsayılan olarak etkinleştirmek istiyoruz.
    - Bunun için ayrıca matchIfMissing'in değerini true olarak ayarladık.
    - Bu özelliği zamanlamayı etkinleştirmek için ayarlamamız gerekmediği, ancak bu özelliği zamanlayıcıyı
      açıkça devre dışı bırakmak için ayarlamamız gerektiği anlamına gelir.
*/

@Configuration
@EnableScheduling
@ConditionalOnProperty(name = "scheduler.enable", matchIfMissing = true)
public class FixedDelayConfig {
}
