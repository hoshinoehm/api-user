package br.com.ehm.apiuser.service;

import br.com.ehm.apiuser.domain.Users;
import br.com.ehm.apiuser.domain.dto.UserDTO;

import java.util.List;

public interface UserService {

    Users findById(Integer id);
    List<Users> findAll();
    Users create(UserDTO obj);
    Users update(UserDTO obj);

}
