package br.com.tawandev.api.config;

import br.com.tawandev.api.domain.User;
import br.com.tawandev.api.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.List;

@Configuration
@Profile("local")
public class LocalConfig implements WebMvcConfigurer {

    @Value("${cors.originPatterns:default}")
    private String corsOriginPatterns = "";

    @Autowired
    private UserRepository repository;

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        var allowedOrigins = corsOriginPatterns.split(",");
        registry.addMapping("/**")
                .allowedMethods("*")
                .allowedOrigins(allowedOrigins)
                .allowCredentials(true);
    }

    @Bean
    public void startDB() {
        User u1 = new User(null, "Tawan", "tawan.tls43@gmail.com", "123");
        User u2 = new User(null, "Silva", "silva.tls43@gmail.com", "123");

        repository.saveAll(List.of(u1, u2));
    }
}
