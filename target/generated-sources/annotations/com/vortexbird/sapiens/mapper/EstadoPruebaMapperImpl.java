package com.vortexbird.sapiens.mapper;

import com.vortexbird.sapiens.domain.EstadoPrueba;
import com.vortexbird.sapiens.dto.EstadoPruebaDTO;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    comments = "version: 1.3.1.Final, compiler: Eclipse JDT (IDE) 1.3.1200.v20200916-0645, environment: Java 15.0.1 (Oracle Corporation)"
)
@Component
public class EstadoPruebaMapperImpl implements EstadoPruebaMapper {

    @Override
    public EstadoPruebaDTO estadoPruebaToEstadoPruebaDTO(EstadoPrueba estadoPrueba) throws Exception {
        if ( estadoPrueba == null ) {
            return null;
        }

        EstadoPruebaDTO estadoPruebaDTO = new EstadoPruebaDTO();

        estadoPruebaDTO.setEsprId( estadoPrueba.getEsprId() );
        estadoPruebaDTO.setEstadoRegistro( estadoPrueba.getEstadoRegistro() );
        estadoPruebaDTO.setFechaCreacion( estadoPrueba.getFechaCreacion() );
        estadoPruebaDTO.setFechaModificacion( estadoPrueba.getFechaModificacion() );
        estadoPruebaDTO.setUsuCreador( estadoPrueba.getUsuCreador() );
        estadoPruebaDTO.setUsuModificador( estadoPrueba.getUsuModificador() );

        return estadoPruebaDTO;
    }

    @Override
    public EstadoPrueba estadoPruebaDTOToEstadoPrueba(EstadoPruebaDTO estadoPruebaDTO) throws Exception {
        if ( estadoPruebaDTO == null ) {
            return null;
        }

        EstadoPrueba estadoPrueba = new EstadoPrueba();

        estadoPrueba.setEsprId( estadoPruebaDTO.getEsprId() );
        estadoPrueba.setEstadoRegistro( estadoPruebaDTO.getEstadoRegistro() );
        estadoPrueba.setFechaCreacion( estadoPruebaDTO.getFechaCreacion() );
        estadoPrueba.setFechaModificacion( estadoPruebaDTO.getFechaModificacion() );
        estadoPrueba.setUsuCreador( estadoPruebaDTO.getUsuCreador() );
        estadoPrueba.setUsuModificador( estadoPruebaDTO.getUsuModificador() );

        return estadoPrueba;
    }

    @Override
    public List<EstadoPruebaDTO> listEstadoPruebaToListEstadoPruebaDTO(List<EstadoPrueba> estadoPruebas) throws Exception {
        if ( estadoPruebas == null ) {
            return null;
        }

        List<EstadoPruebaDTO> list = new ArrayList<EstadoPruebaDTO>( estadoPruebas.size() );
        for ( EstadoPrueba estadoPrueba : estadoPruebas ) {
            list.add( estadoPruebaToEstadoPruebaDTO( estadoPrueba ) );
        }

        return list;
    }

    @Override
    public List<EstadoPrueba> listEstadoPruebaDTOToListEstadoPrueba(List<EstadoPruebaDTO> estadoPruebaDTOs) throws Exception {
        if ( estadoPruebaDTOs == null ) {
            return null;
        }

        List<EstadoPrueba> list = new ArrayList<EstadoPrueba>( estadoPruebaDTOs.size() );
        for ( EstadoPruebaDTO estadoPruebaDTO : estadoPruebaDTOs ) {
            list.add( estadoPruebaDTOToEstadoPrueba( estadoPruebaDTO ) );
        }

        return list;
    }
}
