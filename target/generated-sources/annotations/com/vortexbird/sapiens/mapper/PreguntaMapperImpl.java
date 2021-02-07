package com.vortexbird.sapiens.mapper;

import com.vortexbird.sapiens.domain.Contexto;
import com.vortexbird.sapiens.domain.Modulo;
import com.vortexbird.sapiens.domain.Pregunta;
import com.vortexbird.sapiens.domain.TipoModulo;
import com.vortexbird.sapiens.domain.TipoPregunta;
import com.vortexbird.sapiens.domain.Usuario;
import com.vortexbird.sapiens.dto.PreguntaDTO;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    comments = "version: 1.3.1.Final, compiler: Eclipse JDT (IDE) 1.3.1200.v20200916-0645, environment: Java 15.0.1 (Oracle Corporation)"
)
@Component
public class PreguntaMapperImpl implements PreguntaMapper {

    @Override
    public PreguntaDTO preguntaToPreguntaDTO(Pregunta pregunta) throws Exception {
        if ( pregunta == null ) {
            return null;
        }

        PreguntaDTO preguntaDTO = new PreguntaDTO();

        preguntaDTO.setContId( preguntaContextoContId( pregunta ) );
        preguntaDTO.setNombreContexto( preguntaContextoNombre( pregunta ) );
        preguntaDTO.setTprgId_TipoPregunta( preguntaTipoPreguntaTprgId( pregunta ) );
        preguntaDTO.setCodigoUsuario( preguntaUsuarioCodigo( pregunta ) );
        preguntaDTO.setModuId_Modulo( preguntaModuloModuId( pregunta ) );
        preguntaDTO.setUsuCreador( preguntaUsuarioUsuaId( pregunta ) );
        preguntaDTO.setTimoId( preguntaModuloTipoModuloTimoId( pregunta ) );
        preguntaDTO.setContexto( preguntaContextoDescripcion( pregunta ) );
        preguntaDTO.setDescripcion( pregunta.getDescripcion() );
        preguntaDTO.setEstadoRegistro( pregunta.getEstadoRegistro() );
        preguntaDTO.setFechaCreacion( pregunta.getFechaCreacion() );
        preguntaDTO.setFechaModificacion( pregunta.getFechaModificacion() );
        preguntaDTO.setPregId( pregunta.getPregId() );
        preguntaDTO.setRetroalimentacion( pregunta.getRetroalimentacion() );
        preguntaDTO.setUsuModificador( pregunta.getUsuModificador() );
        preguntaDTO.setComplejidad( pregunta.getComplejidad() );
        preguntaDTO.setValorPregunta( pregunta.getValorPregunta() );
        preguntaDTO.setOrden( pregunta.getOrden() );

        return preguntaDTO;
    }

    @Override
    public Pregunta preguntaDTOToPregunta(PreguntaDTO preguntaDTO) throws Exception {
        if ( preguntaDTO == null ) {
            return null;
        }

        Pregunta pregunta = new Pregunta();

        pregunta.setContexto( preguntaDTOToContexto( preguntaDTO ) );
        pregunta.setModulo( preguntaDTOToModulo( preguntaDTO ) );
        pregunta.setTipoPregunta( preguntaDTOToTipoPregunta( preguntaDTO ) );
        pregunta.setPregId( preguntaDTO.getPregId() );
        pregunta.setDescripcion( preguntaDTO.getDescripcion() );
        pregunta.setEstadoRegistro( preguntaDTO.getEstadoRegistro() );
        pregunta.setFechaCreacion( preguntaDTO.getFechaCreacion() );
        pregunta.setFechaModificacion( preguntaDTO.getFechaModificacion() );
        pregunta.setRetroalimentacion( preguntaDTO.getRetroalimentacion() );
        pregunta.setComplejidad( preguntaDTO.getComplejidad() );
        pregunta.setUsuModificador( preguntaDTO.getUsuModificador() );
        pregunta.setValorPregunta( preguntaDTO.getValorPregunta() );
        pregunta.setOrden( preguntaDTO.getOrden() );

        return pregunta;
    }

    @Override
    public List<PreguntaDTO> listPreguntaToListPreguntaDTO(List<Pregunta> preguntas) throws Exception {
        if ( preguntas == null ) {
            return null;
        }

        List<PreguntaDTO> list = new ArrayList<PreguntaDTO>( preguntas.size() );
        for ( Pregunta pregunta : preguntas ) {
            list.add( preguntaToPreguntaDTO( pregunta ) );
        }

        return list;
    }

    @Override
    public List<Pregunta> listPreguntaDTOToListPregunta(List<PreguntaDTO> preguntaDTOs) throws Exception {
        if ( preguntaDTOs == null ) {
            return null;
        }

        List<Pregunta> list = new ArrayList<Pregunta>( preguntaDTOs.size() );
        for ( PreguntaDTO preguntaDTO : preguntaDTOs ) {
            list.add( preguntaDTOToPregunta( preguntaDTO ) );
        }

        return list;
    }

    private Integer preguntaContextoContId(Pregunta pregunta) {
        if ( pregunta == null ) {
            return null;
        }
        Contexto contexto = pregunta.getContexto();
        if ( contexto == null ) {
            return null;
        }
        Integer contId = contexto.getContId();
        if ( contId == null ) {
            return null;
        }
        return contId;
    }

    private String preguntaContextoNombre(Pregunta pregunta) {
        if ( pregunta == null ) {
            return null;
        }
        Contexto contexto = pregunta.getContexto();
        if ( contexto == null ) {
            return null;
        }
        String nombre = contexto.getNombre();
        if ( nombre == null ) {
            return null;
        }
        return nombre;
    }

    private Integer preguntaTipoPreguntaTprgId(Pregunta pregunta) {
        if ( pregunta == null ) {
            return null;
        }
        TipoPregunta tipoPregunta = pregunta.getTipoPregunta();
        if ( tipoPregunta == null ) {
            return null;
        }
        Integer tprgId = tipoPregunta.getTprgId();
        if ( tprgId == null ) {
            return null;
        }
        return tprgId;
    }

    private String preguntaUsuarioCodigo(Pregunta pregunta) {
        if ( pregunta == null ) {
            return null;
        }
        Usuario usuario = pregunta.getUsuario();
        if ( usuario == null ) {
            return null;
        }
        String codigo = usuario.getCodigo();
        if ( codigo == null ) {
            return null;
        }
        return codigo;
    }

    private Integer preguntaModuloModuId(Pregunta pregunta) {
        if ( pregunta == null ) {
            return null;
        }
        Modulo modulo = pregunta.getModulo();
        if ( modulo == null ) {
            return null;
        }
        Integer moduId = modulo.getModuId();
        if ( moduId == null ) {
            return null;
        }
        return moduId;
    }

    private Integer preguntaUsuarioUsuaId(Pregunta pregunta) {
        if ( pregunta == null ) {
            return null;
        }
        Usuario usuario = pregunta.getUsuario();
        if ( usuario == null ) {
            return null;
        }
        Integer usuaId = usuario.getUsuaId();
        if ( usuaId == null ) {
            return null;
        }
        return usuaId;
    }

    private Integer preguntaModuloTipoModuloTimoId(Pregunta pregunta) {
        if ( pregunta == null ) {
            return null;
        }
        Modulo modulo = pregunta.getModulo();
        if ( modulo == null ) {
            return null;
        }
        TipoModulo tipoModulo = modulo.getTipoModulo();
        if ( tipoModulo == null ) {
            return null;
        }
        Integer timoId = tipoModulo.getTimoId();
        if ( timoId == null ) {
            return null;
        }
        return timoId;
    }

    private String preguntaContextoDescripcion(Pregunta pregunta) {
        if ( pregunta == null ) {
            return null;
        }
        Contexto contexto = pregunta.getContexto();
        if ( contexto == null ) {
            return null;
        }
        String descripcion = contexto.getDescripcion();
        if ( descripcion == null ) {
            return null;
        }
        return descripcion;
    }

    protected Contexto preguntaDTOToContexto(PreguntaDTO preguntaDTO) {
        if ( preguntaDTO == null ) {
            return null;
        }

        Contexto contexto = new Contexto();

        contexto.setNombre( preguntaDTO.getNombreContexto() );
        contexto.setContId( preguntaDTO.getContId() );
        contexto.setDescripcion( preguntaDTO.getContexto() );

        return contexto;
    }

    protected Modulo preguntaDTOToModulo(PreguntaDTO preguntaDTO) {
        if ( preguntaDTO == null ) {
            return null;
        }

        Modulo modulo = new Modulo();

        modulo.setModuId( preguntaDTO.getModuId_Modulo() );

        return modulo;
    }

    protected TipoPregunta preguntaDTOToTipoPregunta(PreguntaDTO preguntaDTO) {
        if ( preguntaDTO == null ) {
            return null;
        }

        TipoPregunta tipoPregunta = new TipoPregunta();

        tipoPregunta.setTprgId( preguntaDTO.getTprgId_TipoPregunta() );

        return tipoPregunta;
    }
}
