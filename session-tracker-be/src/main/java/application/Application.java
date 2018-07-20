package application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@ComponentScan({"controllers", "services", "repositories"})
@EnableMongoRepositories("repositories")
public class Application {

  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);
  }
}
