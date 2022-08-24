package br.com.tawandev.api.services.impl;

import br.com.tawandev.api.domain.User;
import br.com.tawandev.api.repositories.UserRepository;
import br.com.tawandev.api.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository repository;

    @Override
    public User findById(Integer id) {
        Optional<User> obj = repository.findById(id);
        return obj.orElse(null);
    }
}

