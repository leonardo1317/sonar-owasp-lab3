package com.vortexbird.sapiens.mapper;

import com.vortexbird.sapiens.domain.EstadoPrueba;
import com.vortexbird.sapiens.domain.Prueba;
import com.vortexbird.sapiens.domain.PruebaUsuario;
import com.vortexbird.sapiens.domain.Usuario;
import com.vortexbird.sapiens.dto.PruebaUsuarioDTO;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    comments = "version: 1.3.1.Final, compiler: Eclipse JDT (IDE) 1.3.1200.v20200916-0645, environment: Java 15.0.1 (Oracle Corporation)"
)
@Component
public class PruebaUsuarioMapperImpl implements PruebaUsuarioMapper {

    @Override
    public PruebaUsuarioDTO pruebaUsuarioToPruebaUsuarioDTO(PruebaUsuario pruebaUsuario) throws Exception {
        if ( pruebaUsuario == null ) {
            return null;
        }

        PruebaUsuarioDTO pruebaUsuarioDTO = new PruebaUsuarioDTO();

        pruebaUsuarioDTO.setEsprId_EstadoPrueba( pruebaUsuarioEstadoPruebaEsprId( pruebaUsuario ) );
        pruebaUsuarioDTO.setPrueId( pruebaUsuarioPruebaPrueId( pruebaUsuario ) );
        pruebaUsuarioDTO.setUsuaId_Usuario( pruebaUsuarioUsuarioUsuaId( pruebaUsuario ) );
        pruebaUsuarioDTO.setEstadoRegistro( pruebaUsuario.getEstadoRegistro() );
        pruebaUsuarioDTO.setFechaCreacion( pruebaUsuario.getFechaCreacion() );
        pruebaUsuarioDTO.setFechaModificacion( pruebaUsuario.getFechaModificacion() );
        pruebaUsuarioDTO.setPrusId( pruebaUsuario.getPrusId() );
        pruebaUsuarioDTO.setUsuCreador( pruebaUsuario.getUsuCreador() );
        pruebaUsuarioDTO.setUsuModificador( pruebaUsuario.getUsuModificador() );
        pruebaUsuarioDTO.setFechaInicio( pruebaUsuario.getFechaInicio() );
        pruebaUsuarioDTO.setTiempoDisponible( pruebaUsuario.getTiempoDisponible() );
        pruebaUsuarioDTO.setTotalPreguntas( pruebaUsuario.getTotalPreguntas() );
        pruebaUsuarioDTO.setTotalRespuestasCorrectas( pruebaUsuario.getTotalRespuestasCorrectas() );

        return pruebaUsuarioDTO;
    }

    @Override
    public PruebaUsuario pruebaUsuarioDTOToPruebaUsuario(PruebaUsuarioDTO pruebaUsuarioDTO) throws Exception {
        if ( pruebaUsuarioDTO == null ) {
            return null;
        }

        PruebaUsuario pruebaUsuario = new PruebaUsuario();

        pruebaUsuario.setEstadoPrueba( pruebaUsuarioDTOToEstadoPrueba( pruebaUsuarioDTO ) );
        pruebaUsuario.setPrueba( pruebaUsuarioDTOToPrueba( pruebaUsuarioDTO ) );
        pruebaUsuario.setUsuario( pruebaUsuarioDTOToUsuario( pruebaUsuarioDTO ) );
        pruebaUsuario.setPrusId( pruebaUsuarioDTO.getPrusId() );
        pruebaUsuario.setFechaInicio( pruebaUsuarioDTO.getFechaInicio() );
        pruebaUsuario.setTiempoDisponible( pruebaUsuarioDTO.getTiempoDisponible() );
        pruebaUsuario.setTotalPreguntas( pruebaUsuarioDTO.getTotalPreguntas() );
        pruebaUsuario.setTotalRespuestasCorrectas( pruebaUsuarioDTO.getTotalRespuestasCorrectas() );
        pruebaUsuario.setEstadoRegistro( pruebaUsuarioDTO.getEstadoRegistro() );
        pruebaUsuario.setFechaCreacion( pruebaUsuarioDTO.getFechaCreacion() );
        pruebaUsuario.setFechaModificacion( pruebaUsuarioDTO.getFechaModificacion() );
        pruebaUsuario.setUsuCreador( pruebaUsuarioDTO.getUsuCreador() );
        pruebaUsuario.setUsuModificador( pruebaUsuarioDTO.getUsuModificador() );

        return pruebaUsuario;
    }

    @Override
    public List<PruebaUsuarioDTO> listPruebaUsuarioToListPruebaUsuarioDTO(List<PruebaUsuario> pruebaUsuarios) throws Exception {
        if ( pruebaUsuarios == null ) {
            return null;
        }

        List<PruebaUsuarioDTO> list = new ArrayList<PruebaUsuarioDTO>( pruebaUsuarios.size() );
        for ( PruebaUsuario pruebaUsuario : pruebaUsuarios ) {
            list.add( pruebaUsuarioToPruebaUsuarioDTO( pruebaUsuario ) );
        }

        return list;
    }

    @Override
    public List<PruebaUsuario> listPruebaUsuarioDTOToListPruebaUsuario(List<PruebaUsuarioDTO> pruebaUsuarioDTOs) throws Exception {
        if ( pruebaUsuarioDTOs == null ) {
            return null;
        }

        List<PruebaUsuario> list = new ArrayList<PruebaUsuario>( pruebaUsuarioDTOs.size() );
        for ( PruebaUsuarioDTO pruebaUsuarioDTO : pruebaUsuarioDTOs ) {
            list.add( pruebaUsuarioDTOToPruebaUsuario( pruebaUsuarioDTO ) );
        }

        return list;
    }

    private Integer pruebaUsuarioEstadoPruebaEsprId(PruebaUsuario pruebaUsuario) {
        if ( pruebaUsuario == null ) {
            return null;
        }
        EstadoPrueba estadoPrueba = pruebaUsuario.getEstadoPrueba();
        if ( estadoPrueba == null ) {
            return null;
        }
        Integer esprId = estadoPrueba.getEsprId();
        if ( esprId == null ) {
            return null;
        }
        return esprId;
    }

    private Integer pruebaUsuarioPruebaPrueId(PruebaUsuario pruebaUsuario) {
        if ( pruebaUsuario == null ) {
            return null;
        }
        Prueba prueba = pruebaUsuario.getPrueba();
        if ( prueba == null ) {
            return null;
        }
        Integer prueId = prueba.getPrueId();
        if ( prueId == null ) {
            return null;
        }
        return prueId;
    }

    private Integer pruebaUsuarioUsuarioUsuaId(PruebaUsuario pruebaUsuario) {
        if ( pruebaUsuario == null ) {
            return null;
        }
        Usuario usuario = pruebaUsuario.getUsuario();
        if ( usuario == null ) {
            return null;
        }
        Integer usuaId = usuario.getUsuaId();
        if ( usuaId == null ) {
            return null;
        }
        return usuaId;
    }

    protected EstadoPrueba pruebaUsuarioDTOToEstadoPrueba(PruebaUsuarioDTO pruebaUsuarioDTO) {
        if ( pruebaUsuarioDTO == null ) {
            return null;
        }

        EstadoPrueba estadoPrueba = new EstadoPrueba();

        estadoPrueba.setEsprId( pruebaUsuarioDTO.getEsprId_EstadoPrueba() );

        return estadoPrueba;
    }

    protected Prueba pruebaUsuarioDTOToPrueba(PruebaUsuarioDTO pruebaUsuarioDTO) {
        if ( pruebaUsuarioDTO == null ) {
            return null;
        }

        Prueba prueba = new Prueba();

        prueba.setPrueId( pruebaUsuarioDTO.getPrueId() );

        return prueba;
    }

    protected Usuario pruebaUsuarioDTOToUsuario(PruebaUsuarioDTO pruebaUsuarioDTO) {
        if ( pruebaUsuarioDTO == null ) {
            return null;
        }

        Usuario usuario = new Usuario();

        usuario.setUsuaId( pruebaUsuarioDTO.getUsuaId_Usuario() );

        return usuario;
    }
}
