package com.rasitesdmr.springbootscheduling.config;


import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;


@Configuration
@EnableScheduling
@ConditionalOnProperty(name = "scheduler.enable", matchIfMissing = true)
@EnableAsync
public class FixedRateConfig {
}
