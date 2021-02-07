package com.vortexbird.sapiens.mapper;

import com.vortexbird.sapiens.domain.TipoModulo;
import com.vortexbird.sapiens.dto.TipoModuloDTO;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    comments = "version: 1.3.1.Final, compiler: Eclipse JDT (IDE) 1.3.1200.v20200916-0645, environment: Java 15.0.1 (Oracle Corporation)"
)
@Component
public class TipoModuloMapperImpl implements TipoModuloMapper {

    @Override
    public TipoModuloDTO tipoModuloToTipoModuloDTO(TipoModulo tipoModulo) throws Exception {
        if ( tipoModulo == null ) {
            return null;
        }

        TipoModuloDTO tipoModuloDTO = new TipoModuloDTO();

        tipoModuloDTO.setDescripcion( tipoModulo.getDescripcion() );
        tipoModuloDTO.setEstadoRegistro( tipoModulo.getEstadoRegistro() );
        tipoModuloDTO.setFechaCreacion( tipoModulo.getFechaCreacion() );
        tipoModuloDTO.setFechaModificacion( tipoModulo.getFechaModificacion() );
        tipoModuloDTO.setNombre( tipoModulo.getNombre() );
        tipoModuloDTO.setTimoId( tipoModulo.getTimoId() );
        tipoModuloDTO.setUsuCreador( tipoModulo.getUsuCreador() );
        tipoModuloDTO.setUsuModificador( tipoModulo.getUsuModificador() );

        return tipoModuloDTO;
    }

    @Override
    public TipoModulo tipoModuloDTOToTipoModulo(TipoModuloDTO tipoModuloDTO) throws Exception {
        if ( tipoModuloDTO == null ) {
            return null;
        }

        TipoModulo tipoModulo = new TipoModulo();

        tipoModulo.setTimoId( tipoModuloDTO.getTimoId() );
        tipoModulo.setDescripcion( tipoModuloDTO.getDescripcion() );
        tipoModulo.setEstadoRegistro( tipoModuloDTO.getEstadoRegistro() );
        tipoModulo.setFechaCreacion( tipoModuloDTO.getFechaCreacion() );
        tipoModulo.setFechaModificacion( tipoModuloDTO.getFechaModificacion() );
        tipoModulo.setNombre( tipoModuloDTO.getNombre() );
        tipoModulo.setUsuCreador( tipoModuloDTO.getUsuCreador() );
        tipoModulo.setUsuModificador( tipoModuloDTO.getUsuModificador() );

        return tipoModulo;
    }

    @Override
    public List<TipoModuloDTO> listTipoModuloToListTipoModuloDTO(List<TipoModulo> tipoModulos) throws Exception {
        if ( tipoModulos == null ) {
            return null;
        }

        List<TipoModuloDTO> list = new ArrayList<TipoModuloDTO>( tipoModulos.size() );
        for ( TipoModulo tipoModulo : tipoModulos ) {
            list.add( tipoModuloToTipoModuloDTO( tipoModulo ) );
        }

        return list;
    }

    @Override
    public List<TipoModulo> listTipoModuloDTOToListTipoModulo(List<TipoModuloDTO> tipoModuloDTOs) throws Exception {
        if ( tipoModuloDTOs == null ) {
            return null;
        }

        List<TipoModulo> list = new ArrayList<TipoModulo>( tipoModuloDTOs.size() );
        for ( TipoModuloDTO tipoModuloDTO : tipoModuloDTOs ) {
            list.add( tipoModuloDTOToTipoModulo( tipoModuloDTO ) );
        }

        return list;
    }
}
