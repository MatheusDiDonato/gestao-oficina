package com.oficinagenericagestao.Service.ServiceIMP;

import com.oficinagenericagestao.Service.UsuarioService;
import com.oficinagenericagestao.oficinagenericagestao.domain.Usuario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServiceImplementation{
    
    @Autowired 
    UsuarioService usuarioService;
    
    public String validaUsuario(Usuario usuario, String senha){

        if(usuario.getSenha().equals(senha)){
            return "https://www.facebook.com/matheus.donato.73/";
        }else{
            return "Senha inválida.";
        }
    }
}
