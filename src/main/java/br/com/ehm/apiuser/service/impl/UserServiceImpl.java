package br.com.ehm.apiuser.service.impl;

import br.com.ehm.apiuser.domain.User;
import br.com.ehm.apiuser.repositories.UserRepository;
import br.com.ehm.apiuser.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository repository;
    @Override
    public User findById(Integer id) {
        Optional<User> obj = repository.findById(id);
        return obj.orElse(null);
    }
}
