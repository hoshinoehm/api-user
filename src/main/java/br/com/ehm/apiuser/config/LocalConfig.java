package br.com.ehm.apiuser.config;

import br.com.ehm.apiuser.domain.Users;
import br.com.ehm.apiuser.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.List;

@Configuration
@Profile("local")
public class LocalConfig {

    @Autowired
    private UserRepository repository;

    @Bean
    public void startDB(){
        Users u1 = new Users(null, "Hoshino", "hoshi@email.com", "123");
        Users u2 = new Users(null, "Monteiro", "mont  @email.com", "123");

        repository.saveAll(List.of(u1, u2));

    }
}
