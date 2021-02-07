package com.vortexbird.sapiens.mapper;

import com.vortexbird.sapiens.domain.TipoPrueba;
import com.vortexbird.sapiens.dto.TipoPruebaDTO;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    comments = "version: 1.3.1.Final, compiler: Eclipse JDT (IDE) 1.3.1200.v20200916-0645, environment: Java 15.0.1 (Oracle Corporation)"
)
@Component
public class TipoPruebaMapperImpl implements TipoPruebaMapper {

    @Override
    public TipoPruebaDTO tipoPruebaToTipoPruebaDTO(TipoPrueba tipoPrueba) throws Exception {
        if ( tipoPrueba == null ) {
            return null;
        }

        TipoPruebaDTO tipoPruebaDTO = new TipoPruebaDTO();

        tipoPruebaDTO.setDescripcion( tipoPrueba.getDescripcion() );
        tipoPruebaDTO.setEstadoRegistro( tipoPrueba.getEstadoRegistro() );
        tipoPruebaDTO.setFechaCreacion( tipoPrueba.getFechaCreacion() );
        tipoPruebaDTO.setFechaModificacion( tipoPrueba.getFechaModificacion() );
        tipoPruebaDTO.setNombre( tipoPrueba.getNombre() );
        tipoPruebaDTO.setTiprId( tipoPrueba.getTiprId() );
        tipoPruebaDTO.setUsuCreador( tipoPrueba.getUsuCreador() );
        tipoPruebaDTO.setUsuModificador( tipoPrueba.getUsuModificador() );

        return tipoPruebaDTO;
    }

    @Override
    public TipoPrueba tipoPruebaDTOToTipoPrueba(TipoPruebaDTO tipoPruebaDTO) throws Exception {
        if ( tipoPruebaDTO == null ) {
            return null;
        }

        TipoPrueba tipoPrueba = new TipoPrueba();

        tipoPrueba.setTiprId( tipoPruebaDTO.getTiprId() );
        tipoPrueba.setDescripcion( tipoPruebaDTO.getDescripcion() );
        tipoPrueba.setEstadoRegistro( tipoPruebaDTO.getEstadoRegistro() );
        tipoPrueba.setFechaCreacion( tipoPruebaDTO.getFechaCreacion() );
        tipoPrueba.setFechaModificacion( tipoPruebaDTO.getFechaModificacion() );
        tipoPrueba.setNombre( tipoPruebaDTO.getNombre() );
        tipoPrueba.setUsuCreador( tipoPruebaDTO.getUsuCreador() );
        tipoPrueba.setUsuModificador( tipoPruebaDTO.getUsuModificador() );

        return tipoPrueba;
    }

    @Override
    public List<TipoPruebaDTO> listTipoPruebaToListTipoPruebaDTO(List<TipoPrueba> tipoPruebas) throws Exception {
        if ( tipoPruebas == null ) {
            return null;
        }

        List<TipoPruebaDTO> list = new ArrayList<TipoPruebaDTO>( tipoPruebas.size() );
        for ( TipoPrueba tipoPrueba : tipoPruebas ) {
            list.add( tipoPruebaToTipoPruebaDTO( tipoPrueba ) );
        }

        return list;
    }

    @Override
    public List<TipoPrueba> listTipoPruebaDTOToListTipoPrueba(List<TipoPruebaDTO> tipoPruebaDTOs) throws Exception {
        if ( tipoPruebaDTOs == null ) {
            return null;
        }

        List<TipoPrueba> list = new ArrayList<TipoPrueba>( tipoPruebaDTOs.size() );
        for ( TipoPruebaDTO tipoPruebaDTO : tipoPruebaDTOs ) {
            list.add( tipoPruebaDTOToTipoPrueba( tipoPruebaDTO ) );
        }

        return list;
    }
}
