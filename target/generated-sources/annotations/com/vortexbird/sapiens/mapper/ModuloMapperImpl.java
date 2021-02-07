package com.vortexbird.sapiens.mapper;

import com.vortexbird.sapiens.domain.Modulo;
import com.vortexbird.sapiens.domain.TipoModulo;
import com.vortexbird.sapiens.dto.ModuloDTO;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    comments = "version: 1.3.1.Final, compiler: Eclipse JDT (IDE) 1.3.1200.v20200916-0645, environment: Java 15.0.1 (Oracle Corporation)"
)
@Component
public class ModuloMapperImpl implements ModuloMapper {

    @Override
    public ModuloDTO moduloToModuloDTO(Modulo modulo) throws Exception {
        if ( modulo == null ) {
            return null;
        }

        ModuloDTO moduloDTO = new ModuloDTO();

        moduloDTO.setTimoId_TipoModulo( moduloTipoModuloTimoId( modulo ) );
        moduloDTO.setCantidadPreguntas1( modulo.getCantidadPreguntas1() );
        moduloDTO.setCantidadPreguntas2( modulo.getCantidadPreguntas2() );
        moduloDTO.setCantidadPreguntas3( modulo.getCantidadPreguntas3() );
        moduloDTO.setCantidadPreguntas4( modulo.getCantidadPreguntas4() );
        moduloDTO.setDescripcion( modulo.getDescripcion() );
        moduloDTO.setEstadoRegistro( modulo.getEstadoRegistro() );
        moduloDTO.setFechaCreacion( modulo.getFechaCreacion() );
        moduloDTO.setFechaModificacion( modulo.getFechaModificacion() );
        moduloDTO.setModuId( modulo.getModuId() );
        moduloDTO.setNombre( modulo.getNombre() );
        moduloDTO.setPrioridad( modulo.getPrioridad() );
        moduloDTO.setUsuCreador( modulo.getUsuCreador() );
        moduloDTO.setUsuModificador( modulo.getUsuModificador() );
        moduloDTO.setIgualValor( modulo.getIgualValor() );

        return moduloDTO;
    }

    @Override
    public Modulo moduloDTOToModulo(ModuloDTO moduloDTO) throws Exception {
        if ( moduloDTO == null ) {
            return null;
        }

        Modulo modulo = new Modulo();

        modulo.setTipoModulo( moduloDTOToTipoModulo( moduloDTO ) );
        modulo.setModuId( moduloDTO.getModuId() );
        modulo.setCantidadPreguntas1( moduloDTO.getCantidadPreguntas1() );
        modulo.setCantidadPreguntas2( moduloDTO.getCantidadPreguntas2() );
        modulo.setCantidadPreguntas3( moduloDTO.getCantidadPreguntas3() );
        modulo.setCantidadPreguntas4( moduloDTO.getCantidadPreguntas4() );
        modulo.setDescripcion( moduloDTO.getDescripcion() );
        modulo.setEstadoRegistro( moduloDTO.getEstadoRegistro() );
        modulo.setFechaCreacion( moduloDTO.getFechaCreacion() );
        modulo.setFechaModificacion( moduloDTO.getFechaModificacion() );
        modulo.setNombre( moduloDTO.getNombre() );
        modulo.setPrioridad( moduloDTO.getPrioridad() );
        modulo.setUsuCreador( moduloDTO.getUsuCreador() );
        modulo.setUsuModificador( moduloDTO.getUsuModificador() );
        modulo.setIgualValor( moduloDTO.getIgualValor() );

        return modulo;
    }

    @Override
    public List<ModuloDTO> listModuloToListModuloDTO(List<Modulo> modulos) throws Exception {
        if ( modulos == null ) {
            return null;
        }

        List<ModuloDTO> list = new ArrayList<ModuloDTO>( modulos.size() );
        for ( Modulo modulo : modulos ) {
            list.add( moduloToModuloDTO( modulo ) );
        }

        return list;
    }

    @Override
    public List<Modulo> listModuloDTOToListModulo(List<ModuloDTO> moduloDTOs) throws Exception {
        if ( moduloDTOs == null ) {
            return null;
        }

        List<Modulo> list = new ArrayList<Modulo>( moduloDTOs.size() );
        for ( ModuloDTO moduloDTO : moduloDTOs ) {
            list.add( moduloDTOToModulo( moduloDTO ) );
        }

        return list;
    }

    private Integer moduloTipoModuloTimoId(Modulo modulo) {
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

    protected TipoModulo moduloDTOToTipoModulo(ModuloDTO moduloDTO) {
        if ( moduloDTO == null ) {
            return null;
        }

        TipoModulo tipoModulo = new TipoModulo();

        tipoModulo.setTimoId( moduloDTO.getTimoId_TipoModulo() );

        return tipoModulo;
    }
}
