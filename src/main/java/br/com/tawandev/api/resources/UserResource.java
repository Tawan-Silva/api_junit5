package br.com.tawandev.api.resources;

import br.com.tawandev.api.domain.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/user")
public class UserResource {

    @GetMapping(value = "/{id}")
    public ResponseEntity<User> findBuId(@PathVariable Integer id) {

        return ResponseEntity.ok().body(new User(2, "Tawan", "tawan.tls50@gmail.com", "12345678"));
    }

}
