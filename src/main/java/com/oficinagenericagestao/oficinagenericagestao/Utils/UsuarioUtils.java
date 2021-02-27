package com.oficinagenericagestao.oficinagenericagestao.Utils;

import com.oficinagenericagestao.oficinagenericagestao.Dto.UsuarioDTO;
import com.oficinagenericagestao.oficinagenericagestao.domain.Usuario;
import com.oficinagenericagestao.oficinagenericagestao.repository.UsuarioRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

public class UsuarioUtils {

    public static String validaUsuario(UsuarioDTO usuarioDTO, Usuario usuario) {

        if (usuarioDTO.getSenha().equals(usuario.getSenha())) {
            return "Ok";
        } else {
            return "Senha inválida";
        }
    }

}
