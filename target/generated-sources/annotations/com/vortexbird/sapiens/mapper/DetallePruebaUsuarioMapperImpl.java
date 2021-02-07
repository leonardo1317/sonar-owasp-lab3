package com.vortexbird.sapiens.mapper;

import com.vortexbird.sapiens.domain.DetallePruebaUsuario;
import com.vortexbird.sapiens.domain.Pregunta;
import com.vortexbird.sapiens.domain.PruebaUsuario;
import com.vortexbird.sapiens.domain.Respuesta;
import com.vortexbird.sapiens.dto.DetallePruebaUsuarioDTO;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    comments = "version: 1.3.1.Final, compiler: Eclipse JDT (IDE) 1.3.1200.v20200916-0645, environment: Java 15.0.1 (Oracle Corporation)"
)
@Component
public class DetallePruebaUsuarioMapperImpl implements DetallePruebaUsuarioMapper {

    @Override
    public DetallePruebaUsuarioDTO detallePruebaUsuarioToDetallePruebaUsuarioDTO(DetallePruebaUsuario detallePruebaUsuario) throws Exception {
        if ( detallePruebaUsuario == null ) {
            return null;
        }

        DetallePruebaUsuarioDTO detallePruebaUsuarioDTO = new DetallePruebaUsuarioDTO();

        detallePruebaUsuarioDTO.setPregId( detallePruebaUsuarioPreguntaPregId( detallePruebaUsuario ) );
        detallePruebaUsuarioDTO.setRespId( detallePruebaUsuarioRespuestaRespId( detallePruebaUsuario ) );
        detallePruebaUsuarioDTO.setPrusId( detallePruebaUsuarioPruebaUsuarioPrusId( detallePruebaUsuario ) );
        detallePruebaUsuarioDTO.setDpruId( detallePruebaUsuario.getDpruId() );
        detallePruebaUsuarioDTO.setEstadoRegistro( detallePruebaUsuario.getEstadoRegistro() );
        detallePruebaUsuarioDTO.setFechaCreacion( detallePruebaUsuario.getFechaCreacion() );
        detallePruebaUsuarioDTO.setFechaModificacion( detallePruebaUsuario.getFechaModificacion() );
        detallePruebaUsuarioDTO.setUsuCreador( detallePruebaUsuario.getUsuCreador() );
        detallePruebaUsuarioDTO.setUsuModificador( detallePruebaUsuario.getUsuModificador() );
        detallePruebaUsuarioDTO.setRespuestaAbierta( detallePruebaUsuario.getRespuestaAbierta() );

        return detallePruebaUsuarioDTO;
    }

    @Override
    public DetallePruebaUsuario detallePruebaUsuarioDTOToDetallePruebaUsuario(DetallePruebaUsuarioDTO detallePruebaUsuarioDTO) throws Exception {
        if ( detallePruebaUsuarioDTO == null ) {
            return null;
        }

        DetallePruebaUsuario detallePruebaUsuario = new DetallePruebaUsuario();

        detallePruebaUsuario.setRespuesta( detallePruebaUsuarioDTOToRespuesta( detallePruebaUsuarioDTO ) );
        detallePruebaUsuario.setPregunta( detallePruebaUsuarioDTOToPregunta( detallePruebaUsuarioDTO ) );
        detallePruebaUsuario.setPruebaUsuario( detallePruebaUsuarioDTOToPruebaUsuario( detallePruebaUsuarioDTO ) );
        detallePruebaUsuario.setDpruId( detallePruebaUsuarioDTO.getDpruId() );
        detallePruebaUsuario.setRespuestaAbierta( detallePruebaUsuarioDTO.getRespuestaAbierta() );
        detallePruebaUsuario.setEstadoRegistro( detallePruebaUsuarioDTO.getEstadoRegistro() );
        detallePruebaUsuario.setFechaCreacion( detallePruebaUsuarioDTO.getFechaCreacion() );
        detallePruebaUsuario.setFechaModificacion( detallePruebaUsuarioDTO.getFechaModificacion() );
        detallePruebaUsuario.setUsuCreador( detallePruebaUsuarioDTO.getUsuCreador() );
        detallePruebaUsuario.setUsuModificador( detallePruebaUsuarioDTO.getUsuModificador() );

        return detallePruebaUsuario;
    }

    @Override
    public List<DetallePruebaUsuarioDTO> listDetallePruebaUsuarioToListDetallePruebaUsuarioDTO(List<DetallePruebaUsuario> detallePruebaUsuarios) throws Exception {
        if ( detallePruebaUsuarios == null ) {
            return null;
        }

        List<DetallePruebaUsuarioDTO> list = new ArrayList<DetallePruebaUsuarioDTO>( detallePruebaUsuarios.size() );
        for ( DetallePruebaUsuario detallePruebaUsuario : detallePruebaUsuarios ) {
            list.add( detallePruebaUsuarioToDetallePruebaUsuarioDTO( detallePruebaUsuario ) );
        }

        return list;
    }

    @Override
    public List<DetallePruebaUsuario> listDetallePruebaUsuarioDTOToListDetallePruebaUsuario(List<DetallePruebaUsuarioDTO> detallePruebaUsuarioDTOs) throws Exception {
        if ( detallePruebaUsuarioDTOs == null ) {
            return null;
        }

        List<DetallePruebaUsuario> list = new ArrayList<DetallePruebaUsuario>( detallePruebaUsuarioDTOs.size() );
        for ( DetallePruebaUsuarioDTO detallePruebaUsuarioDTO : detallePruebaUsuarioDTOs ) {
            list.add( detallePruebaUsuarioDTOToDetallePruebaUsuario( detallePruebaUsuarioDTO ) );
        }

        return list;
    }

    private Integer detallePruebaUsuarioPreguntaPregId(DetallePruebaUsuario detallePruebaUsuario) {
        if ( detallePruebaUsuario == null ) {
            return null;
        }
        Pregunta pregunta = detallePruebaUsuario.getPregunta();
        if ( pregunta == null ) {
            return null;
        }
        Integer pregId = pregunta.getPregId();
        if ( pregId == null ) {
            return null;
        }
        return pregId;
    }

    private Integer detallePruebaUsuarioRespuestaRespId(DetallePruebaUsuario detallePruebaUsuario) {
        if ( detallePruebaUsuario == null ) {
            return null;
        }
        Respuesta respuesta = detallePruebaUsuario.getRespuesta();
        if ( respuesta == null ) {
            return null;
        }
        Integer respId = respuesta.getRespId();
        if ( respId == null ) {
            return null;
        }
        return respId;
    }

    private Integer detallePruebaUsuarioPruebaUsuarioPrusId(DetallePruebaUsuario detallePruebaUsuario) {
        if ( detallePruebaUsuario == null ) {
            return null;
        }
        PruebaUsuario pruebaUsuario = detallePruebaUsuario.getPruebaUsuario();
        if ( pruebaUsuario == null ) {
            return null;
        }
        Integer prusId = pruebaUsuario.getPrusId();
        if ( prusId == null ) {
            return null;
        }
        return prusId;
    }

    protected Respuesta detallePruebaUsuarioDTOToRespuesta(DetallePruebaUsuarioDTO detallePruebaUsuarioDTO) {
        if ( detallePruebaUsuarioDTO == null ) {
            return null;
        }

        Respuesta respuesta = new Respuesta();

        respuesta.setRespId( detallePruebaUsuarioDTO.getRespId() );

        return respuesta;
    }

    protected Pregunta detallePruebaUsuarioDTOToPregunta(DetallePruebaUsuarioDTO detallePruebaUsuarioDTO) {
        if ( detallePruebaUsuarioDTO == null ) {
            return null;
        }

        Pregunta pregunta = new Pregunta();

        pregunta.setPregId( detallePruebaUsuarioDTO.getPregId() );

        return pregunta;
    }

    protected PruebaUsuario detallePruebaUsuarioDTOToPruebaUsuario(DetallePruebaUsuarioDTO detallePruebaUsuarioDTO) {
        if ( detallePruebaUsuarioDTO == null ) {
            return null;
        }

        PruebaUsuario pruebaUsuario = new PruebaUsuario();

        pruebaUsuario.setPrusId( detallePruebaUsuarioDTO.getPrusId() );

        return pruebaUsuario;
    }
}
