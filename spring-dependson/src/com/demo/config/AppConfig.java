package com.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

import com.demo.bean.BeanOne;
import com.demo.bean.BeanThree;
import com.demo.bean.BeanTwo;

@Configuration
public class AppConfig {

   @Bean("beanOne")
   @DependsOn(value = { "beanTwo", "beanThree" })
   public BeanOne getBeanOne() {
      return new BeanOne();
   }

   @Bean("beanTwo")
   public BeanTwo getBeanTwo() {
      return new BeanTwo();
   }

   @Bean("beanThree")
   public BeanThree getBeanThree() {
      return new BeanThree();
   }
}