package com.oficinagenericagestao.oficinagenericagestao.Utils;

import com.oficinagenericagestao.oficinagenericagestao.Dto.UsuarioDTO;
import com.oficinagenericagestao.oficinagenericagestao.domain.Usuario;
import com.oficinagenericagestao.oficinagenericagestao.repository.UsuarioRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class UsuarioUtils {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public String validaUsuario(UsuarioDTO usuarioDTO) {
        Usuario usuario = usuarioRepository.findByCpf(usuarioDTO.getCpf());
        if (usuario.getSenha().equals(usuarioDTO.getSenha())) {
            return "Ok";
        } else {
            return "Senha inválida";
        }
    }

    public ResponseEntity<String> criaNovoUsuario(Usuario usuarioMetodo) {

        try {
            Usuario usuario = usuarioRepository.findByCpf(usuarioMetodo.getCpf());
            if (usuario.getCpf() != null) {
                return ResponseEntity.ok().body("Ja existe um cadastro para este cpf");
            }
        } catch (NullPointerException E) {
            return ResponseEntity.ok().body("Nao existem usuarios, este pode ser cadastrado");
        }
        return null;
    }
}
