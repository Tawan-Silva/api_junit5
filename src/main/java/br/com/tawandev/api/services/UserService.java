package br.com.tawandev.api.services;

import br.com.tawandev.api.domain.User;
import br.com.tawandev.api.domain.dto.UserDTO;

import java.util.List;

public interface UserService {

    User findById(Integer id);
    List<User> findAll();
    User create(UserDTO obj);
    User update(UserDTO obj);
}
