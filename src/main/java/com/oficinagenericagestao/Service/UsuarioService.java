package com.oficinagenericagestao.Service;

import com.oficinagenericagestao.oficinagenericagestao.domain.Usuario;

public interface UsuarioService {
    
    String validaUsuario(Usuario usuario, String senha);
}
