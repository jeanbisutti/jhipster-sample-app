package io.github.jhipster.sample.config;

import org.quickperf.spring.sql.QuickPerfProxyBeanPostProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class QuickPerfSpringConfiguration {

    @Bean
    public QuickPerfProxyBeanPostProcessor dataSourceBeanPostProcessor() {
        return new QuickPerfProxyBeanPostProcessor();
    }

}
