package br.com.tawandev.api.services;

import br.com.tawandev.api.domain.User;

import java.util.List;

public interface UserService {

    User findById(Integer id);

    List<User> findAll();
}
