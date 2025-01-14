package com.example.restclient;

import com.example.client.resttemplate.RestTemplateConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication(scanBasePackages = "com.example.restclient")
@Import(RestTemplateConfiguration.class)
public class RestClientApplication {

  public static void main(String[] args) {
    SpringApplication.run(RestClientApplication.class, args);
  }

}
