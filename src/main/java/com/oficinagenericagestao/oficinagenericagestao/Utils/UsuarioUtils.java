package com.oficinagenericagestao.oficinagenericagestao.Utils;

import com.oficinagenericagestao.oficinagenericagestao.Dto.UsuarioDTO;
import com.oficinagenericagestao.oficinagenericagestao.domain.Usuario;
import com.oficinagenericagestao.oficinagenericagestao.repository.UsuarioRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UsuarioUtils {
    
    @Autowired
    private  UsuarioRepository usuarioRepository;

    public String validaUsuario(UsuarioDTO usuarioDTO) {
        Usuario usuario = usuarioRepository.findByCpf(usuarioDTO.getCpf());
        if (usuario.getSenha().equals(usuarioDTO.getSenha())) {
            return "Ok";
        } else {
            return "Senha inválida";
        }
    }
}
