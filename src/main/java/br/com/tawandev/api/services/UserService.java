package br.com.tawandev.api.services;

import br.com.tawandev.api.domain.User;

public interface UserService {

    User findById(Integer id);
}
