package com.vortexbird.sapiens.mapper;

import com.vortexbird.sapiens.domain.Programa;
import com.vortexbird.sapiens.domain.TipoUsuario;
import com.vortexbird.sapiens.domain.Usuario;
import com.vortexbird.sapiens.dto.UsuarioDTO;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    comments = "version: 1.3.1.Final, compiler: Eclipse JDT (IDE) 1.3.1200.v20200916-0645, environment: Java 15.0.1 (Oracle Corporation)"
)
@Component
public class UsuarioMapperImpl implements UsuarioMapper {

    @Override
    public UsuarioDTO usuarioToUsuarioDTO(Usuario usuario) throws Exception {
        if ( usuario == null ) {
            return null;
        }

        UsuarioDTO usuarioDTO = new UsuarioDTO();

        usuarioDTO.setProgId_Programa( usuarioProgramaProgId( usuario ) );
        usuarioDTO.setTiusId_TipoUsuario( usuarioTipoUsuarioTiusId( usuario ) );
        usuarioDTO.setApellido( usuario.getApellido() );
        usuarioDTO.setCelular( usuario.getCelular() );
        usuarioDTO.setCodigo( usuario.getCodigo() );
        usuarioDTO.setCorreo( usuario.getCorreo() );
        usuarioDTO.setEstadoRegistro( usuario.getEstadoRegistro() );
        usuarioDTO.setFechaCreacion( usuario.getFechaCreacion() );
        usuarioDTO.setFechaModificacion( usuario.getFechaModificacion() );
        usuarioDTO.setGenero( usuario.getGenero() );
        usuarioDTO.setIdentificacion( usuario.getIdentificacion() );
        usuarioDTO.setNombre( usuario.getNombre() );
        usuarioDTO.setPassword( usuario.getPassword() );
        usuarioDTO.setUsuCreador( usuario.getUsuCreador() );
        usuarioDTO.setUsuModificador( usuario.getUsuModificador() );
        usuarioDTO.setUsuaId( usuario.getUsuaId() );

        return usuarioDTO;
    }

    @Override
    public Usuario usuarioDTOToUsuario(UsuarioDTO usuarioDTO) throws Exception {
        if ( usuarioDTO == null ) {
            return null;
        }

        Usuario usuario = new Usuario();

        usuario.setTipoUsuario( usuarioDTOToTipoUsuario( usuarioDTO ) );
        usuario.setPrograma( usuarioDTOToPrograma( usuarioDTO ) );
        usuario.setUsuaId( usuarioDTO.getUsuaId() );
        usuario.setApellido( usuarioDTO.getApellido() );
        usuario.setCelular( usuarioDTO.getCelular() );
        usuario.setCodigo( usuarioDTO.getCodigo() );
        usuario.setCorreo( usuarioDTO.getCorreo() );
        usuario.setEstadoRegistro( usuarioDTO.getEstadoRegistro() );
        usuario.setFechaCreacion( usuarioDTO.getFechaCreacion() );
        usuario.setFechaModificacion( usuarioDTO.getFechaModificacion() );
        usuario.setGenero( usuarioDTO.getGenero() );
        usuario.setIdentificacion( usuarioDTO.getIdentificacion() );
        usuario.setNombre( usuarioDTO.getNombre() );
        usuario.setPassword( usuarioDTO.getPassword() );
        usuario.setUsuCreador( usuarioDTO.getUsuCreador() );
        usuario.setUsuModificador( usuarioDTO.getUsuModificador() );

        return usuario;
    }

    @Override
    public List<UsuarioDTO> listUsuarioToListUsuarioDTO(List<Usuario> usuarios) throws Exception {
        if ( usuarios == null ) {
            return null;
        }

        List<UsuarioDTO> list = new ArrayList<UsuarioDTO>( usuarios.size() );
        for ( Usuario usuario : usuarios ) {
            list.add( usuarioToUsuarioDTO( usuario ) );
        }

        return list;
    }

    @Override
    public List<Usuario> listUsuarioDTOToListUsuario(List<UsuarioDTO> usuarioDTOs) throws Exception {
        if ( usuarioDTOs == null ) {
            return null;
        }

        List<Usuario> list = new ArrayList<Usuario>( usuarioDTOs.size() );
        for ( UsuarioDTO usuarioDTO : usuarioDTOs ) {
            list.add( usuarioDTOToUsuario( usuarioDTO ) );
        }

        return list;
    }

    private Integer usuarioProgramaProgId(Usuario usuario) {
        if ( usuario == null ) {
            return null;
        }
        Programa programa = usuario.getPrograma();
        if ( programa == null ) {
            return null;
        }
        Integer progId = programa.getProgId();
        if ( progId == null ) {
            return null;
        }
        return progId;
    }

    private Integer usuarioTipoUsuarioTiusId(Usuario usuario) {
        if ( usuario == null ) {
            return null;
        }
        TipoUsuario tipoUsuario = usuario.getTipoUsuario();
        if ( tipoUsuario == null ) {
            return null;
        }
        Integer tiusId = tipoUsuario.getTiusId();
        if ( tiusId == null ) {
            return null;
        }
        return tiusId;
    }

    protected TipoUsuario usuarioDTOToTipoUsuario(UsuarioDTO usuarioDTO) {
        if ( usuarioDTO == null ) {
            return null;
        }

        TipoUsuario tipoUsuario = new TipoUsuario();

        tipoUsuario.setTiusId( usuarioDTO.getTiusId_TipoUsuario() );

        return tipoUsuario;
    }

    protected Programa usuarioDTOToPrograma(UsuarioDTO usuarioDTO) {
        if ( usuarioDTO == null ) {
            return null;
        }

        Programa programa = new Programa();

        programa.setProgId( usuarioDTO.getProgId_Programa() );

        return programa;
    }
}
