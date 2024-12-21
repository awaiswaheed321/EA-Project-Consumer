package edu.miu.ea.awais.eaprojectconsumer;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.EnableJms;

@SpringBootApplication
@EnableJms
@OpenAPIDefinition(info = @Info(
        title = "${spring.application.name}",
        description = "${app.description}",
        version = "${app.version}",
        contact = @Contact(name = "Awais Waheed", email = "awaheed@miu.edu")
))
public class EaProjectConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(EaProjectConsumerApplication.class, args);
    }

}
