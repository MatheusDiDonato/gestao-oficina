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

    public ResponseEntity<?> criaNovoUsuario(Usuario usuarioMetodo) {

        try {
            Usuario usuario = usuarioRepository.findByCpf(usuarioMetodo.getCpf());
            if (usuario.getCpf() != null) {
                return ResponseEntity.status(400).body("Já existe um cadastro para este cpf.");
            }
        } catch (NullPointerException E) {
            if(usuarioMetodo.getCpf().length()<11){
                return ResponseEntity.status(400).body("Este cpf não pode ser cadastrado.");
            }else if(usuarioMetodo.getCpf().length()>11){
                return ResponseEntity.status(400).body("Este cpf não pode ser cadastrado.");
            }
        }
        usuarioRepository.save(usuarioMetodo);
        return ResponseEntity.ok().body("Usuario cadastrado com sucesso. Seja bem vindo "
         + usuarioMetodo.getNome().toUpperCase());
    }
}
