package com.example.Kirjakauppa;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.boot.autoconfigure.h2.H2ConsoleProperties;

import com.example.Kirjakauppa.domain.Kirja;
import com.example.Kirjakauppa.domain.KirjaRepository;

@SpringBootApplication
public class KirjakauppaApplication {

	public static void main(String[] args) {
		SpringApplication.run(KirjakauppaApplication.class, args);
	}

	@Bean 
	public CommandLineRunner demo(KirjaRepository repository) {
		return (args) -> {
			
			Kirja k1 = new Kirja("Sinuhe","Mika Waltari","1947","001","50.90");
			Kirja k2 = new Kirja("Nakkilehti","Pasi Heino","2019","002","6.66");
			
			repository.save(k1);
			repository.save(k2);
			
			
		};
	}
}
