package br.com.tawandev.api.services;

import br.com.tawandev.api.domain.User;
import br.com.tawandev.api.domain.dto.UserDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface UserService {

    User findById(Integer id);
    Page<UserDTO> findAll(Pageable pageable);
    User create(UserDTO obj);
    User update(UserDTO obj);
    void delete(Integer id);
}
