package com.vortexbird.sapiens.mapper;

import com.vortexbird.sapiens.domain.TipoPregunta;
import com.vortexbird.sapiens.dto.TipoPreguntaDTO;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    comments = "version: 1.3.1.Final, compiler: Eclipse JDT (IDE) 1.3.1200.v20200916-0645, environment: Java 15.0.1 (Oracle Corporation)"
)
@Component
public class TipoPreguntaMapperImpl implements TipoPreguntaMapper {

    @Override
    public TipoPreguntaDTO tipoPreguntaToTipoPreguntaDTO(TipoPregunta tipoPregunta) throws Exception {
        if ( tipoPregunta == null ) {
            return null;
        }

        TipoPreguntaDTO tipoPreguntaDTO = new TipoPreguntaDTO();

        tipoPreguntaDTO.setEstadoRegistro( tipoPregunta.getEstadoRegistro() );
        tipoPreguntaDTO.setFechaCreacion( tipoPregunta.getFechaCreacion() );
        tipoPreguntaDTO.setFechaModificacion( tipoPregunta.getFechaModificacion() );
        tipoPreguntaDTO.setNombre( tipoPregunta.getNombre() );
        tipoPreguntaDTO.setTprgId( tipoPregunta.getTprgId() );
        tipoPreguntaDTO.setUsuCreador( tipoPregunta.getUsuCreador() );
        tipoPreguntaDTO.setUsuModificador( tipoPregunta.getUsuModificador() );

        return tipoPreguntaDTO;
    }

    @Override
    public TipoPregunta tipoPreguntaDTOToTipoPregunta(TipoPreguntaDTO tipoPreguntaDTO) throws Exception {
        if ( tipoPreguntaDTO == null ) {
            return null;
        }

        TipoPregunta tipoPregunta = new TipoPregunta();

        tipoPregunta.setTprgId( tipoPreguntaDTO.getTprgId() );
        tipoPregunta.setEstadoRegistro( tipoPreguntaDTO.getEstadoRegistro() );
        tipoPregunta.setFechaCreacion( tipoPreguntaDTO.getFechaCreacion() );
        tipoPregunta.setFechaModificacion( tipoPreguntaDTO.getFechaModificacion() );
        tipoPregunta.setNombre( tipoPreguntaDTO.getNombre() );
        tipoPregunta.setUsuCreador( tipoPreguntaDTO.getUsuCreador() );
        tipoPregunta.setUsuModificador( tipoPreguntaDTO.getUsuModificador() );

        return tipoPregunta;
    }

    @Override
    public List<TipoPreguntaDTO> listTipoPreguntaToListTipoPreguntaDTO(List<TipoPregunta> tipoPreguntas) throws Exception {
        if ( tipoPreguntas == null ) {
            return null;
        }

        List<TipoPreguntaDTO> list = new ArrayList<TipoPreguntaDTO>( tipoPreguntas.size() );
        for ( TipoPregunta tipoPregunta : tipoPreguntas ) {
            list.add( tipoPreguntaToTipoPreguntaDTO( tipoPregunta ) );
        }

        return list;
    }

    @Override
    public List<TipoPregunta> listTipoPreguntaDTOToListTipoPregunta(List<TipoPreguntaDTO> tipoPreguntaDTOs) throws Exception {
        if ( tipoPreguntaDTOs == null ) {
            return null;
        }

        List<TipoPregunta> list = new ArrayList<TipoPregunta>( tipoPreguntaDTOs.size() );
        for ( TipoPreguntaDTO tipoPreguntaDTO : tipoPreguntaDTOs ) {
            list.add( tipoPreguntaDTOToTipoPregunta( tipoPreguntaDTO ) );
        }

        return list;
    }
}
