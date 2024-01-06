package org.avyudaya.curtain;

import org.avyudaya.curtain.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class CurtainApplication {

	@Autowired
	PostRepository postRepository;

	public static void main(String[] args) {
		SpringApplication.run(CurtainApplication.class, args);
	}

}
