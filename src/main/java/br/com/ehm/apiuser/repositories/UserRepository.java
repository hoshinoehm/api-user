package br.com.ehm.apiuser.repositories;

import br.com.ehm.apiuser.domain.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Users, Integer> {

}
