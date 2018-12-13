package org.anupam.bddframework.StepDefinition;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(
        basePackages = {"com.gdn.qa", "net.thucydides", "net.serenitybdd"}
)
public class Application {
    public Application() {
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
