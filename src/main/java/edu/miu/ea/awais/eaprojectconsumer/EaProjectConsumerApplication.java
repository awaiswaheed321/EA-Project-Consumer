package edu.miu.ea.awais.eaprojectconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.EnableJms;

@SpringBootApplication
@EnableJms
public class EaProjectConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(EaProjectConsumerApplication.class, args);
    }

}
