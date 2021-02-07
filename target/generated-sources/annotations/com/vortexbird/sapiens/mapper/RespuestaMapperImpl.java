package com.vortexbird.sapiens.mapper;

import com.vortexbird.sapiens.domain.Pregunta;
import com.vortexbird.sapiens.domain.Respuesta;
import com.vortexbird.sapiens.dto.RespuestaDTO;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    comments = "version: 1.3.1.Final, compiler: Eclipse JDT (IDE) 1.3.1200.v20200916-0645, environment: Java 15.0.1 (Oracle Corporation)"
)
@Component
public class RespuestaMapperImpl implements RespuestaMapper {

    @Override
    public RespuestaDTO respuestaToRespuestaDTO(Respuesta respuesta) throws Exception {
        if ( respuesta == null ) {
            return null;
        }

        RespuestaDTO respuestaDTO = new RespuestaDTO();

        respuestaDTO.setPregId_Pregunta( respuestaPreguntaPregId( respuesta ) );
        respuestaDTO.setCorrecta( respuesta.getCorrecta() );
        respuestaDTO.setDescripcion( respuesta.getDescripcion() );
        respuestaDTO.setEstadoRegistro( respuesta.getEstadoRegistro() );
        respuestaDTO.setFechaCreacion( respuesta.getFechaCreacion() );
        respuestaDTO.setFechaModificacion( respuesta.getFechaModificacion() );
        respuestaDTO.setRespId( respuesta.getRespId() );
        respuestaDTO.setRetroalimentacion( respuesta.getRetroalimentacion() );
        respuestaDTO.setUsuCreador( respuesta.getUsuCreador() );
        respuestaDTO.setUsuModificador( respuesta.getUsuModificador() );

        return respuestaDTO;
    }

    @Override
    public Respuesta respuestaDTOToRespuesta(RespuestaDTO respuestaDTO) throws Exception {
        if ( respuestaDTO == null ) {
            return null;
        }

        Respuesta respuesta = new Respuesta();

        respuesta.setPregunta( respuestaDTOToPregunta( respuestaDTO ) );
        respuesta.setRespId( respuestaDTO.getRespId() );
        respuesta.setCorrecta( respuestaDTO.getCorrecta() );
        respuesta.setDescripcion( respuestaDTO.getDescripcion() );
        respuesta.setEstadoRegistro( respuestaDTO.getEstadoRegistro() );
        respuesta.setFechaCreacion( respuestaDTO.getFechaCreacion() );
        respuesta.setFechaModificacion( respuestaDTO.getFechaModificacion() );
        respuesta.setRetroalimentacion( respuestaDTO.getRetroalimentacion() );
        respuesta.setUsuCreador( respuestaDTO.getUsuCreador() );
        respuesta.setUsuModificador( respuestaDTO.getUsuModificador() );

        return respuesta;
    }

    @Override
    public List<RespuestaDTO> listRespuestaToListRespuestaDTO(List<Respuesta> respuestas) throws Exception {
        if ( respuestas == null ) {
            return null;
        }

        List<RespuestaDTO> list = new ArrayList<RespuestaDTO>( respuestas.size() );
        for ( Respuesta respuesta : respuestas ) {
            list.add( respuestaToRespuestaDTO( respuesta ) );
        }

        return list;
    }

    @Override
    public List<Respuesta> listRespuestaDTOToListRespuesta(List<RespuestaDTO> respuestaDTOs) throws Exception {
        if ( respuestaDTOs == null ) {
            return null;
        }

        List<Respuesta> list = new ArrayList<Respuesta>( respuestaDTOs.size() );
        for ( RespuestaDTO respuestaDTO : respuestaDTOs ) {
            list.add( respuestaDTOToRespuesta( respuestaDTO ) );
        }

        return list;
    }

    private Integer respuestaPreguntaPregId(Respuesta respuesta) {
        if ( respuesta == null ) {
            return null;
        }
        Pregunta pregunta = respuesta.getPregunta();
        if ( pregunta == null ) {
            return null;
        }
        Integer pregId = pregunta.getPregId();
        if ( pregId == null ) {
            return null;
        }
        return pregId;
    }

    protected Pregunta respuestaDTOToPregunta(RespuestaDTO respuestaDTO) {
        if ( respuestaDTO == null ) {
            return null;
        }

        Pregunta pregunta = new Pregunta();

        pregunta.setPregId( respuestaDTO.getPregId_Pregunta() );

        return pregunta;
    }
}
