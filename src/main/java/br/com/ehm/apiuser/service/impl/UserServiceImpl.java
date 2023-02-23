package br.com.ehm.apiuser.service.impl;

import br.com.ehm.apiuser.domain.Users;
import br.com.ehm.apiuser.repositories.UserRepository;
import br.com.ehm.apiuser.service.UserService;
import br.com.ehm.apiuser.service.exeptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository repository;
    @Override
    public Users findById(Integer id) {
        Optional<Users> obj = repository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }
}
