package br.com.ehm.apiuser.resoucers;

import br.com.ehm.apiuser.domain.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/user")
public class UserResoucers {

    @GetMapping(value = "/{id}")
    public ResponseEntity<User> findById(@PathVariable Integer id){

        return ResponseEntity.ok().body(new User(1, "Hoshino", "hoshino@email.com","1234" ));
    }
}
