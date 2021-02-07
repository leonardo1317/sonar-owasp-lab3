package com.vortexbird.sapiens.mapper;

import com.vortexbird.sapiens.domain.Modulo;
import com.vortexbird.sapiens.domain.Prueba;
import com.vortexbird.sapiens.domain.PruebaModulo;
import com.vortexbird.sapiens.dto.PruebaModuloDTO;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    comments = "version: 1.3.1.Final, compiler: Eclipse JDT (IDE) 1.3.1200.v20200916-0645, environment: Java 15.0.1 (Oracle Corporation)"
)
@Component
public class PruebaModuloMapperImpl implements PruebaModuloMapper {

    @Override
    public PruebaModuloDTO pruebaModuloToPruebaModuloDTO(PruebaModulo pruebaModulo) throws Exception {
        if ( pruebaModulo == null ) {
            return null;
        }

        PruebaModuloDTO pruebaModuloDTO = new PruebaModuloDTO();

        pruebaModuloDTO.setPrueId_Prueba( pruebaModuloPruebaPrueId( pruebaModulo ) );
        pruebaModuloDTO.setModuId_Modulo( pruebaModuloModuloModuId( pruebaModulo ) );
        pruebaModuloDTO.setEstadoRegistro( pruebaModulo.getEstadoRegistro() );
        pruebaModuloDTO.setFechaCreacion( pruebaModulo.getFechaCreacion() );
        pruebaModuloDTO.setFechaModificacion( pruebaModulo.getFechaModificacion() );
        pruebaModuloDTO.setPrmoId( pruebaModulo.getPrmoId() );
        pruebaModuloDTO.setUsuCreador( pruebaModulo.getUsuCreador() );
        pruebaModuloDTO.setUsuModificador( pruebaModulo.getUsuModificador() );

        return pruebaModuloDTO;
    }

    @Override
    public PruebaModulo pruebaModuloDTOToPruebaModulo(PruebaModuloDTO pruebaModuloDTO) throws Exception {
        if ( pruebaModuloDTO == null ) {
            return null;
        }

        PruebaModulo pruebaModulo = new PruebaModulo();

        pruebaModulo.setModulo( pruebaModuloDTOToModulo( pruebaModuloDTO ) );
        pruebaModulo.setPrueba( pruebaModuloDTOToPrueba( pruebaModuloDTO ) );
        pruebaModulo.setPrmoId( pruebaModuloDTO.getPrmoId() );
        pruebaModulo.setEstadoRegistro( pruebaModuloDTO.getEstadoRegistro() );
        pruebaModulo.setFechaCreacion( pruebaModuloDTO.getFechaCreacion() );
        pruebaModulo.setFechaModificacion( pruebaModuloDTO.getFechaModificacion() );
        pruebaModulo.setUsuCreador( pruebaModuloDTO.getUsuCreador() );
        pruebaModulo.setUsuModificador( pruebaModuloDTO.getUsuModificador() );

        return pruebaModulo;
    }

    @Override
    public List<PruebaModuloDTO> listPruebaModuloToListPruebaModuloDTO(List<PruebaModulo> pruebaModulos) throws Exception {
        if ( pruebaModulos == null ) {
            return null;
        }

        List<PruebaModuloDTO> list = new ArrayList<PruebaModuloDTO>( pruebaModulos.size() );
        for ( PruebaModulo pruebaModulo : pruebaModulos ) {
            list.add( pruebaModuloToPruebaModuloDTO( pruebaModulo ) );
        }

        return list;
    }

    @Override
    public List<PruebaModulo> listPruebaModuloDTOToListPruebaModulo(List<PruebaModuloDTO> pruebaModuloDTOs) throws Exception {
        if ( pruebaModuloDTOs == null ) {
            return null;
        }

        List<PruebaModulo> list = new ArrayList<PruebaModulo>( pruebaModuloDTOs.size() );
        for ( PruebaModuloDTO pruebaModuloDTO : pruebaModuloDTOs ) {
            list.add( pruebaModuloDTOToPruebaModulo( pruebaModuloDTO ) );
        }

        return list;
    }

    private Integer pruebaModuloPruebaPrueId(PruebaModulo pruebaModulo) {
        if ( pruebaModulo == null ) {
            return null;
        }
        Prueba prueba = pruebaModulo.getPrueba();
        if ( prueba == null ) {
            return null;
        }
        Integer prueId = prueba.getPrueId();
        if ( prueId == null ) {
            return null;
        }
        return prueId;
    }

    private Integer pruebaModuloModuloModuId(PruebaModulo pruebaModulo) {
        if ( pruebaModulo == null ) {
            return null;
        }
        Modulo modulo = pruebaModulo.getModulo();
        if ( modulo == null ) {
            return null;
        }
        Integer moduId = modulo.getModuId();
        if ( moduId == null ) {
            return null;
        }
        return moduId;
    }

    protected Modulo pruebaModuloDTOToModulo(PruebaModuloDTO pruebaModuloDTO) {
        if ( pruebaModuloDTO == null ) {
            return null;
        }

        Modulo modulo = new Modulo();

        modulo.setModuId( pruebaModuloDTO.getModuId_Modulo() );

        return modulo;
    }

    protected Prueba pruebaModuloDTOToPrueba(PruebaModuloDTO pruebaModuloDTO) {
        if ( pruebaModuloDTO == null ) {
            return null;
        }

        Prueba prueba = new Prueba();

        prueba.setPrueId( pruebaModuloDTO.getPrueId_Prueba() );

        return prueba;
    }
}
