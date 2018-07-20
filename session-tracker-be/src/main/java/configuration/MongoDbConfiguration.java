package configuration;

import cz.jirutka.spring.embedmongo.EmbeddedMongoFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import java.io.IOException;

@EnableMongoRepositories(basePackages = "repositories")
@Configuration
public class MongoDbConfiguration {

  private static final String MONGO_DB_URL = "localhost";
  private static final String MONGO_DB_NAME = "embeded_db";

  @Bean
  public MongoTemplate mongoTemplate() throws IOException {
    EmbeddedMongoFactoryBean mongo = new EmbeddedMongoFactoryBean();
    mongo.setBindIp(MONGO_DB_URL);

    return new MongoTemplate(mongo.getObject(), MONGO_DB_NAME);
  }
}
