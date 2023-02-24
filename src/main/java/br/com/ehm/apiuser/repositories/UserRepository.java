package br.com.ehm.apiuser.repositories;

import br.com.ehm.apiuser.domain.Users;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<Users, Integer> {

    Optional<Users> findByEmail(String email);
}
