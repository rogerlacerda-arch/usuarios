package com.rogerlacerda.usuarios.business;

import com.rogerlacerda.usuarios.business.converter.UsuarioConverter;
import com.rogerlacerda.usuarios.business.dto.UsuarioDTO;
import com.rogerlacerda.usuarios.infrastructure.entity.Usuario;
import com.rogerlacerda.usuarios.infrastructure.repository.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;
    private final UsuarioConverter usuarioConverter;

    public UsuarioDTO salvaUsuario(UsuarioDTO usuarioDTO) {
        Usuario usuario = usuarioConverter.paraUsuario(usuarioDTO);
        return usuarioConverter.paraUsuarioDTO(
                usuarioRepository.save(usuario)
        );
    }
}
