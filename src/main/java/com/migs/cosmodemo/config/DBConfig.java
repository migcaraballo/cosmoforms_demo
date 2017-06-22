package com.migs.cosmodemo.config;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.net.UnknownHostException;

/**
 * Created by migc on 5/24/17.
 */

@Configuration
@ComponentScan(basePackages = "com.migs.cosmodemo.dao")
public class DBConfig {

	private static final String DBNAME = "cosmoforms";
	private static final String DBHOST = "localhost";
	private static final int DBPORT = 27017;

	public MongoClient mongoClient() throws UnknownHostException {
		return new MongoClient(DBHOST, DBPORT);
	}

	@Bean
	public MongoDatabase mongoDatabase() throws UnknownHostException {
		return mongoClient().getDatabase(DBNAME);
	}

}
