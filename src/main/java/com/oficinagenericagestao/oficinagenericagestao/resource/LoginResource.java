package com.oficinagenericagestao.oficinagenericagestao.resource;

import java.util.List;

import com.oficinagenericagestao.oficinagenericagestao.Dto.UsuarioDTO;
import com.oficinagenericagestao.oficinagenericagestao.Utils.UsuarioUtils;
import com.oficinagenericagestao.oficinagenericagestao.domain.Usuario;
import com.oficinagenericagestao.oficinagenericagestao.repository.UsuarioRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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

    @PostMapping(value = "/logar")
    public ResponseEntity<String> fazLogin(@RequestBody UsuarioDTO usuarioDTO) {
    String password = usuarioDTO.getSenha();
    Usuario usuario = usuarioRepository.findByCpf(usuarioDTO.getCpf());
    return ResponseEntity.ok().body(UsuarioUtils.validaUsuario(usuario, password));
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

