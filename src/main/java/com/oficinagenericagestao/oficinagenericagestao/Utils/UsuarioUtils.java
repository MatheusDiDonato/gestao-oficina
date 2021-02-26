package com.oficinagenericagestao.oficinagenericagestao.Utils;

import com.oficinagenericagestao.oficinagenericagestao.domain.Usuario;

public class UsuarioUtils {
    public static String validaUsuario(Usuario usuario, String password){

        if(usuario.getSenha().equals(password)){
            return "Logado";
        }else{
            return "Senha inválida.";
        }
    }
    
}
