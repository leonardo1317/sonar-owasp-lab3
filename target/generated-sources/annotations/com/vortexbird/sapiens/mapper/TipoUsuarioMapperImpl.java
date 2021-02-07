package com.vortexbird.sapiens.mapper;

import com.vortexbird.sapiens.domain.TipoUsuario;
import com.vortexbird.sapiens.dto.TipoUsuarioDTO;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    comments = "version: 1.3.1.Final, compiler: Eclipse JDT (IDE) 1.3.1200.v20200916-0645, environment: Java 15.0.1 (Oracle Corporation)"
)
@Component
public class TipoUsuarioMapperImpl implements TipoUsuarioMapper {

    @Override
    public TipoUsuarioDTO tipoUsuarioToTipoUsuarioDTO(TipoUsuario tipoUsuario) throws Exception {
        if ( tipoUsuario == null ) {
            return null;
        }

        TipoUsuarioDTO tipoUsuarioDTO = new TipoUsuarioDTO();

        tipoUsuarioDTO.setEstadoRegistro( tipoUsuario.getEstadoRegistro() );
        tipoUsuarioDTO.setFechaCreacion( tipoUsuario.getFechaCreacion() );
        tipoUsuarioDTO.setFechaModificacion( tipoUsuario.getFechaModificacion() );
        tipoUsuarioDTO.setTiusId( tipoUsuario.getTiusId() );
        tipoUsuarioDTO.setUsuCreador( tipoUsuario.getUsuCreador() );
        tipoUsuarioDTO.setUsuModificador( tipoUsuario.getUsuModificador() );

        return tipoUsuarioDTO;
    }

    @Override
    public TipoUsuario tipoUsuarioDTOToTipoUsuario(TipoUsuarioDTO tipoUsuarioDTO) throws Exception {
        if ( tipoUsuarioDTO == null ) {
            return null;
        }

        TipoUsuario tipoUsuario = new TipoUsuario();

        tipoUsuario.setTiusId( tipoUsuarioDTO.getTiusId() );
        tipoUsuario.setEstadoRegistro( tipoUsuarioDTO.getEstadoRegistro() );
        tipoUsuario.setFechaCreacion( tipoUsuarioDTO.getFechaCreacion() );
        tipoUsuario.setFechaModificacion( tipoUsuarioDTO.getFechaModificacion() );
        tipoUsuario.setUsuCreador( tipoUsuarioDTO.getUsuCreador() );
        tipoUsuario.setUsuModificador( tipoUsuarioDTO.getUsuModificador() );

        return tipoUsuario;
    }

    @Override
    public List<TipoUsuarioDTO> listTipoUsuarioToListTipoUsuarioDTO(List<TipoUsuario> tipoUsuarios) throws Exception {
        if ( tipoUsuarios == null ) {
            return null;
        }

        List<TipoUsuarioDTO> list = new ArrayList<TipoUsuarioDTO>( tipoUsuarios.size() );
        for ( TipoUsuario tipoUsuario : tipoUsuarios ) {
            list.add( tipoUsuarioToTipoUsuarioDTO( tipoUsuario ) );
        }

        return list;
    }

    @Override
    public List<TipoUsuario> listTipoUsuarioDTOToListTipoUsuario(List<TipoUsuarioDTO> tipoUsuarioDTOs) throws Exception {
        if ( tipoUsuarioDTOs == null ) {
            return null;
        }

        List<TipoUsuario> list = new ArrayList<TipoUsuario>( tipoUsuarioDTOs.size() );
        for ( TipoUsuarioDTO tipoUsuarioDTO : tipoUsuarioDTOs ) {
            list.add( tipoUsuarioDTOToTipoUsuario( tipoUsuarioDTO ) );
        }

        return list;
    }
}
