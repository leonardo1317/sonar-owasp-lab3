package com.vortexbird.sapiens.mapper;

import com.vortexbird.sapiens.domain.Prueba;
import com.vortexbird.sapiens.domain.TipoPrueba;
import com.vortexbird.sapiens.dto.PruebaDTO;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    comments = "version: 1.3.1.Final, compiler: Eclipse JDT (IDE) 1.3.1200.v20200916-0645, environment: Java 15.0.1 (Oracle Corporation)"
)
@Component
public class PruebaMapperImpl implements PruebaMapper {

    @Override
    public PruebaDTO pruebaToPruebaDTO(Prueba prueba) throws Exception {
        if ( prueba == null ) {
            return null;
        }

        PruebaDTO pruebaDTO = new PruebaDTO();

        pruebaDTO.setNombreTipoPrueba( pruebaTipoPruebaNombre( prueba ) );
        pruebaDTO.setTiprId_TipoPrueba( pruebaTipoPruebaTiprId( prueba ) );
        pruebaDTO.setEstadoRegistro( prueba.getEstadoRegistro() );
        pruebaDTO.setFechaCreacion( prueba.getFechaCreacion() );
        pruebaDTO.setFechaFinal( prueba.getFechaFinal() );
        pruebaDTO.setFechaInicial( prueba.getFechaInicial() );
        pruebaDTO.setFechaModificacion( prueba.getFechaModificacion() );
        pruebaDTO.setPrueId( prueba.getPrueId() );
        pruebaDTO.setTiempo( prueba.getTiempo() );
        pruebaDTO.setUsuCreador( prueba.getUsuCreador() );
        pruebaDTO.setUsuModificador( prueba.getUsuModificador() );

        return pruebaDTO;
    }

    @Override
    public Prueba pruebaDTOToPrueba(PruebaDTO pruebaDTO) throws Exception {
        if ( pruebaDTO == null ) {
            return null;
        }

        Prueba prueba = new Prueba();

        prueba.setTipoPrueba( pruebaDTOToTipoPrueba( pruebaDTO ) );
        prueba.setPrueId( pruebaDTO.getPrueId() );
        prueba.setEstadoRegistro( pruebaDTO.getEstadoRegistro() );
        prueba.setFechaCreacion( pruebaDTO.getFechaCreacion() );
        prueba.setFechaFinal( pruebaDTO.getFechaFinal() );
        prueba.setFechaInicial( pruebaDTO.getFechaInicial() );
        prueba.setFechaModificacion( pruebaDTO.getFechaModificacion() );
        prueba.setTiempo( pruebaDTO.getTiempo() );
        prueba.setUsuCreador( pruebaDTO.getUsuCreador() );
        prueba.setUsuModificador( pruebaDTO.getUsuModificador() );

        return prueba;
    }

    @Override
    public List<PruebaDTO> listPruebaToListPruebaDTO(List<Prueba> pruebas) throws Exception {
        if ( pruebas == null ) {
            return null;
        }

        List<PruebaDTO> list = new ArrayList<PruebaDTO>( pruebas.size() );
        for ( Prueba prueba : pruebas ) {
            list.add( pruebaToPruebaDTO( prueba ) );
        }

        return list;
    }

    @Override
    public List<Prueba> listPruebaDTOToListPrueba(List<PruebaDTO> pruebaDTOs) throws Exception {
        if ( pruebaDTOs == null ) {
            return null;
        }

        List<Prueba> list = new ArrayList<Prueba>( pruebaDTOs.size() );
        for ( PruebaDTO pruebaDTO : pruebaDTOs ) {
            list.add( pruebaDTOToPrueba( pruebaDTO ) );
        }

        return list;
    }

    private String pruebaTipoPruebaNombre(Prueba prueba) {
        if ( prueba == null ) {
            return null;
        }
        TipoPrueba tipoPrueba = prueba.getTipoPrueba();
        if ( tipoPrueba == null ) {
            return null;
        }
        String nombre = tipoPrueba.getNombre();
        if ( nombre == null ) {
            return null;
        }
        return nombre;
    }

    private Integer pruebaTipoPruebaTiprId(Prueba prueba) {
        if ( prueba == null ) {
            return null;
        }
        TipoPrueba tipoPrueba = prueba.getTipoPrueba();
        if ( tipoPrueba == null ) {
            return null;
        }
        Integer tiprId = tipoPrueba.getTiprId();
        if ( tiprId == null ) {
            return null;
        }
        return tiprId;
    }

    protected TipoPrueba pruebaDTOToTipoPrueba(PruebaDTO pruebaDTO) {
        if ( pruebaDTO == null ) {
            return null;
        }

        TipoPrueba tipoPrueba = new TipoPrueba();

        tipoPrueba.setTiprId( pruebaDTO.getTiprId_TipoPrueba() );

        return tipoPrueba;
    }
}
