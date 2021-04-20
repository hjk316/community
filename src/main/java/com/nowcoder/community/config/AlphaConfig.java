package com.nowcoder.community.config;

import org.springframework.context.annotation.Bean;

import java.text.SimpleDateFormat;

public class AlphaConfig {

    @Bean
    public SimpleDateFormat simpleDateFormat(){
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    }
}
