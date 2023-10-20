package com.redhat.Bike.Service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoClientDatabaseFactory;
import org.springframework.data.mongodb.core.convert.MongoConverter;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.data.mongodb.repository.support.MongoRepositoryFactory;
import org.springframework.data.repository.core.support.RepositoryFactorySupport;

@Configuration
@PropertySource("classpath:application.properties")
@EnableMongoRepositories(basePackages = "com.example.bike_service.repository")
public class AppConfig {

    @Value("${spring.data.mongodb.host}")
    private String mongodbHost;

    @Value("${spring.data.mongodb.port}")
    private int mongodbPort;

    @Value("${spring.data.mongodb.database}")
    private String mongodbDatabase;

    @Bean
    public SimpleMongoClientDatabaseFactory mongoDatabaseFactory() {
        return new SimpleMongoClientDatabaseFactory(mongodbHost, mongodbPort, mongodbDatabase);
    }

    @Bean
    public MongoTemplate mongoTemplate() {
        return new MongoTemplate(mongoDatabaseFactory());
    }

    @Bean
    public RepositoryFactorySupport repositoryFactorySupport(MongoTemplate mongoTemplate) {
        return new MongoRepositoryFactory(mongoTemplate);
    }
}
