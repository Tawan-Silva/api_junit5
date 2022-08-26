package br.com.tawandev.api.resources;

import br.com.tawandev.api.domain.dto.UserDTO;
import br.com.tawandev.api.services.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/user")
@Api(value = "API REST User")
@CrossOrigin(origins = "**")
public class UserResource {

    public static final String ID = "/{id}";
    @Autowired
    private ModelMapper mapper;

    @Autowired
    private UserService service;

    @ApiOperation(value = "Retorna um unico Usuário pelo Id.")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Retorna uma usuário"),
            @ApiResponse(code = 403, message = "Você não tem permissão para acessar este recurso."),
            @ApiResponse(code = 404, message = "Usuário não encontrado ou inexistente."),
    })
    @GetMapping(value = ID)
    public ResponseEntity<UserDTO> findById(@PathVariable Integer id) {
        return ResponseEntity.ok().body(mapper.map(service.findById(id), UserDTO.class));
    }

    @ApiOperation(value = "Retorna uma Lista de Usuários.")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Retorna lista com todos os usuários."),
            @ApiResponse(code = 403, message = "Você não tem permissão para acessar este recurso."),
    })
    @GetMapping
    public ResponseEntity<List<UserDTO>> findAll() {
        return ResponseEntity.ok()
                .body(service.findAll()
                        .stream().map(x -> mapper.map(x, UserDTO.class)).collect(Collectors.toList()));
    }

    @ApiOperation(value = "Salva um Usuário.")
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Usuário criado com sucesso."),
            @ApiResponse(code = 403, message = "Você não tem permissão para acessar este recurso."),
            @ApiResponse(code = 404, message = "Usuário não encontrado."),
    })
    @PostMapping
    public ResponseEntity<UserDTO> create(@RequestBody UserDTO obj) {
        URI uri = ServletUriComponentsBuilder.fromCurrentRequestUri()
                .path(ID).buildAndExpand(service.create(obj).getId()).toUri();

        return ResponseEntity.created(uri).build();
    }

    @ApiOperation(value = "Atualiza os dados de um Usuário pelo Id.")
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Dados do usuário foi atualizado com sucesso."),
            @ApiResponse(code = 403, message = "Você não tem permissão para acessar este recurso."),
            @ApiResponse(code = 404, message = "Usuário não encontrado."),
    })
    @PutMapping(value = ID)
    public ResponseEntity<UserDTO> update(@PathVariable Integer id, @RequestBody UserDTO obj) {
        obj.setId(id);
        return ResponseEntity.ok().body(mapper.map(service.update(obj), UserDTO.class));
    }

    @ApiOperation(value = "Deleta um Usuário pelo Id.")
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Usuário deletado com sucesso."),
            @ApiResponse(code = 403, message = "Você não tem permissão para acessar este recurso."),
            @ApiResponse(code = 404, message = "Usuário não encontrado."),
    })
    @DeleteMapping(value = ID)
    public ResponseEntity<UserDTO> delete(@PathVariable Integer id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
