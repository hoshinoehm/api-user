package br.com.ehm.apiuser.service.impl;

import br.com.ehm.apiuser.domain.Users;
import br.com.ehm.apiuser.domain.dto.UserDTO;
import br.com.ehm.apiuser.repositories.UserRepository;
import br.com.ehm.apiuser.service.UserService;
import br.com.ehm.apiuser.service.exeptions.DataIntegratyViolationException;
import br.com.ehm.apiuser.service.exeptions.ObjectNotFoundException;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository repository;

    @Autowired
    private ModelMapper mapper;
    @Override
    public Users findById(Integer id) {
        Optional<Users> obj = repository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }

    public List<Users> findAll(){
        return repository.findAll();
    }

    @Override
    public Users create(UserDTO obj) {
        findByEmail(obj);
        return repository.save(mapper.map(obj, Users.class));
    }

    private void findByEmail(UserDTO obj){
        Optional<Users> users = repository.findByEmail(obj.getEmail());
        if(users.isPresent()){
            throw new DataIntegratyViolationException("Email já cadastrado no sistema");
        }
    }
}
