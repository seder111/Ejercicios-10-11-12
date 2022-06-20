package com.example.Ejercicios101112;

import com.example.Ejercicios101112.entities.Laptop;
import com.example.Ejercicios101112.repositories.LaptopRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Ejercicios789Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Ejercicios789Application.class, args);

		LaptopRepository repository = context.getBean(LaptopRepository.class);

		Laptop laptop1 = new Laptop(null,"Asus",1000,16,"Windows 11","AMD Graphics","Ryzen 7","Negro",15.6,1.5);
		Laptop laptop2 = new Laptop(null,"Acer",1000,8,"Windows 10","Intel Graphics","Intel i5","Plata",15.6,1.7);
		Laptop laptop3 = new Laptop(null,"Apple",256,8,"MacOs","Integrate M1","M1","Space Grey",13.3,1.1);

		repository.save(laptop1);
		repository.save(laptop2);
		repository.save(laptop3);
	}

}
