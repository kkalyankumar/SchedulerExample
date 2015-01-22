package com.ehc.scheduler;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
  public static void main(String[] args) {
    new ClassPathXmlApplicationContext("SpringConfig.xml");

  }
}
