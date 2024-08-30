package com.doguy.tutorial2;

import com.doguy.tutorial2.model.Alien;
import com.doguy.tutorial2.repo.AlienRepo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Tutorial2Application {

	public static void main(String[] args) {

		ApplicationContext  context = SpringApplication.run(Tutorial2Application.class, args);
		Alien alien1 = context.getBean(Alien.class);

		alien1.setId(111);
		alien1.setName("Doguy");
		alien1.setTech("Java");

		AlienRepo repo = context.getBean(AlienRepo.class);
		repo.save(alien1);
		System.out.print(repo.findAll());
	}

}
