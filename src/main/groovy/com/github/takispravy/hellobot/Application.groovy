package com.github.takispravy.hellobot

import groovyx.net.http.RESTClient
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.Bean
import org.springframework.core.task.SimpleAsyncTaskExecutor
import org.springframework.core.task.TaskExecutor

@SpringBootApplication
class Application {

    @Bean
    TaskExecutor taskExecutor() {
        new SimpleAsyncTaskExecutor()
    }

    @Bean
    RESTClient telegram() {
        new RESTClient('https://api.telegram.org/')
    }

    static void main(String[] args) {
        SpringApplication.run(Application, args)
    }
}

