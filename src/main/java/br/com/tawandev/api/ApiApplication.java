package br.com.tawandev.api;

import br.com.tawandev.api.domain.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiApplication.class, args);
	}

	User user = new User(1, "Tawan", "tawan.tls43@gmail.com", "12345678");
}
