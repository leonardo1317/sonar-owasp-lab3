package com.vortexbird.sapiens.mapper;

import com.vortexbird.sapiens.domain.Contexto;
import com.vortexbird.sapiens.domain.Modulo;
import com.vortexbird.sapiens.dto.ContextoDTO;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    comments = "version: 1.3.1.Final, compiler: Eclipse JDT (IDE) 1.3.1200.v20200916-0645, environment: Java 15.0.1 (Oracle Corporation)"
)
@Component
public class ContextoMapperImpl implements ContextoMapper {

    @Override
    public ContextoDTO contextoToContextoDTO(Contexto contexto) throws Exception {
        if ( contexto == null ) {
            return null;
        }

        ContextoDTO contextoDTO = new ContextoDTO();

        contextoDTO.setModuId( contextoModuloModuId( contexto ) );
        contextoDTO.setEstadoRegistro( contexto.getEstadoRegistro() );
        contextoDTO.setFechaCreacion( contexto.getFechaCreacion() );
        contextoDTO.setFechaModificacion( contexto.getFechaModificacion() );
        contextoDTO.setContId( contexto.getContId() );
        contextoDTO.setUsuCreador( contexto.getUsuCreador() );
        contextoDTO.setUsuModificador( contexto.getUsuModificador() );
        contextoDTO.setNombre( contexto.getNombre() );
        contextoDTO.setDescripcion( contexto.getDescripcion() );

        return contextoDTO;
    }

    @Override
    public Contexto contextoDTOToContexto(ContextoDTO contextoDTO) throws Exception {
        if ( contextoDTO == null ) {
            return null;
        }

        Contexto contexto = new Contexto();

        contexto.setModulo( contextoDTOToModulo( contextoDTO ) );
        contexto.setContId( contextoDTO.getContId() );
        contexto.setEstadoRegistro( contextoDTO.getEstadoRegistro() );
        contexto.setFechaCreacion( contextoDTO.getFechaCreacion() );
        contexto.setFechaModificacion( contextoDTO.getFechaModificacion() );
        contexto.setUsuCreador( contextoDTO.getUsuCreador() );
        contexto.setUsuModificador( contextoDTO.getUsuModificador() );
        contexto.setNombre( contextoDTO.getNombre() );
        contexto.setDescripcion( contextoDTO.getDescripcion() );

        return contexto;
    }

    @Override
    public List<ContextoDTO> listContextoToListContextoDTO(List<Contexto> contextos) throws Exception {
        if ( contextos == null ) {
            return null;
        }

        List<ContextoDTO> list = new ArrayList<ContextoDTO>( contextos.size() );
        for ( Contexto contexto : contextos ) {
            list.add( contextoToContextoDTO( contexto ) );
        }

        return list;
    }

    @Override
    public List<Contexto> listContextoDTOToListContexto(List<ContextoDTO> contextoDTOs) throws Exception {
        if ( contextoDTOs == null ) {
            return null;
        }

        List<Contexto> list = new ArrayList<Contexto>( contextoDTOs.size() );
        for ( ContextoDTO contextoDTO : contextoDTOs ) {
            list.add( contextoDTOToContexto( contextoDTO ) );
        }

        return list;
    }

    private Integer contextoModuloModuId(Contexto contexto) {
        if ( contexto == null ) {
            return null;
        }
        Modulo modulo = contexto.getModulo();
        if ( modulo == null ) {
            return null;
        }
        Integer moduId = modulo.getModuId();
        if ( moduId == null ) {
            return null;
        }
        return moduId;
    }

    protected Modulo contextoDTOToModulo(ContextoDTO contextoDTO) {
        if ( contextoDTO == null ) {
            return null;
        }

        Modulo modulo = new Modulo();

        modulo.setModuId( contextoDTO.getModuId() );

        return modulo;
    }
}
