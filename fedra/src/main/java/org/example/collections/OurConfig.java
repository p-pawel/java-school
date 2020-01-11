package org.example.collections;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
//@Import(OurConfig.class)
public class OurConfig {

    @Bean(name = "extraHello")
    public String hello() {
        return "hello";
    }
}
