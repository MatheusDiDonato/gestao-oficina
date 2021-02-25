package com.oficinagenericagestao.oficinagenericagestao.resource;

import java.util.List;

import com.oficinagenericagestao.Service.ServiceIMP.UsuarioServiceImplementation;
import com.oficinagenericagestao.oficinagenericagestao.domain.Usuario;
import com.oficinagenericagestao.oficinagenericagestao.repository.UsuarioRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/login")
public class LoginResource {

    @Autowired
    private UsuarioRepository usuarioRepository;
    @Autowired
    private UsuarioServiceImplementation usuarioService;

    @PostMapping(value = "/logar")
    public String fazLogin(@RequestBody String cpf, String senha) {
        Usuario usuario_transfer = usuarioRepository.findByCpf(cpf);
        return usuarioService.validaUsuario(usuario_transfer, senha);
    }

    @GetMapping(value = "/listar-usuarios")
    public List<Usuario> buscaUsuario() {
        return usuarioRepository.findAll();
    }


    @PostMapping(value = "/teste")
    public String teste(){
        return "ok";
    }
}

