package br.com.ehm.apiuser.repositories;

import br.com.ehm.apiuser.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

}
