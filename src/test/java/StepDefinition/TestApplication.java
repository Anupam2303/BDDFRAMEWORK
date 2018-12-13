package StepDefinition;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(
        basePackages = {"org.anupam.bddframework", "net.thucydides", "net.serenitybdd"}
)
public class TestApplication {
    public TestApplication() {
    }

    public static void main(String[] args) {
        SpringApplication.run(TestApplication.class, args);
    }
}
