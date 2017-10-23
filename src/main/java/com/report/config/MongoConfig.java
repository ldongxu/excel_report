package com.report.config;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;
import com.mongodb.ServerAddress;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;

import java.util.Arrays;

/**
 * Created by 刘东旭 on 2017/10/21.
 */
@Configuration
@PropertySource("classpath:/jdbc.properties")
public class MongoConfig extends AbstractMongoConfiguration {
    @Autowired
    private Environment env;

    @Override
    protected String getDatabaseName() {
        return "ReportDB";
    }


    @Override
    public Mongo mongo() throws Exception {
        MongoCredential credential = MongoCredential.createCredential(env.getProperty("mongo.username"),"ReportDB",env.getProperty("mongo.password").toCharArray());
        return new MongoClient(new ServerAddress(env.getProperty("mongo.url"), env.getProperty("mongo.port", int.class,27017)),
                Arrays.asList(credential));
    }
}
