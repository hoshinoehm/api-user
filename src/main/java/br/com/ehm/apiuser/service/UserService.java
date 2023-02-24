package br.com.ehm.apiuser.service;

import br.com.ehm.apiuser.domain.Users;

import java.util.List;

public interface UserService {

    Users findById(Integer id);
    List<Users> findAll();
}
