package com.logback;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LogApplication implements CommandLineRunner{

    private final static Logger logger= LoggerFactory.getLogger(LogApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(LogApplication.class, args);
    }

    @Override
    public void run(String... arg0) throws Exception {
        logger.error("=========hello World========");

        logger.debug("=========hello World========");
    }
}
