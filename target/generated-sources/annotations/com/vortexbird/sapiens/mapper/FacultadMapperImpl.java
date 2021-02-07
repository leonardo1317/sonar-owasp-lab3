package com.vortexbird.sapiens.mapper;

import com.vortexbird.sapiens.domain.Facultad;
import com.vortexbird.sapiens.dto.FacultadDTO;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    comments = "version: 1.3.1.Final, compiler: Eclipse JDT (IDE) 1.3.1200.v20200916-0645, environment: Java 15.0.1 (Oracle Corporation)"
)
@Component
public class FacultadMapperImpl implements FacultadMapper {

    @Override
    public FacultadDTO facultadToFacultadDTO(Facultad facultad) throws Exception {
        if ( facultad == null ) {
            return null;
        }

        FacultadDTO facultadDTO = new FacultadDTO();

        facultadDTO.setDescripcion( facultad.getDescripcion() );
        facultadDTO.setEstadoRegistro( facultad.getEstadoRegistro() );
        facultadDTO.setFacuId( facultad.getFacuId() );
        facultadDTO.setFechaCreacion( facultad.getFechaCreacion() );
        facultadDTO.setFechaModificacion( facultad.getFechaModificacion() );
        facultadDTO.setNombre( facultad.getNombre() );
        facultadDTO.setUsuCreador( facultad.getUsuCreador() );
        facultadDTO.setUsuModificador( facultad.getUsuModificador() );

        return facultadDTO;
    }

    @Override
    public Facultad facultadDTOToFacultad(FacultadDTO facultadDTO) throws Exception {
        if ( facultadDTO == null ) {
            return null;
        }

        Facultad facultad = new Facultad();

        facultad.setFacuId( facultadDTO.getFacuId() );
        facultad.setDescripcion( facultadDTO.getDescripcion() );
        facultad.setEstadoRegistro( facultadDTO.getEstadoRegistro() );
        facultad.setFechaCreacion( facultadDTO.getFechaCreacion() );
        facultad.setFechaModificacion( facultadDTO.getFechaModificacion() );
        facultad.setNombre( facultadDTO.getNombre() );
        facultad.setUsuCreador( facultadDTO.getUsuCreador() );
        facultad.setUsuModificador( facultadDTO.getUsuModificador() );

        return facultad;
    }

    @Override
    public List<FacultadDTO> listFacultadToListFacultadDTO(List<Facultad> facultads) throws Exception {
        if ( facultads == null ) {
            return null;
        }

        List<FacultadDTO> list = new ArrayList<FacultadDTO>( facultads.size() );
        for ( Facultad facultad : facultads ) {
            list.add( facultadToFacultadDTO( facultad ) );
        }

        return list;
    }

    @Override
    public List<Facultad> listFacultadDTOToListFacultad(List<FacultadDTO> facultadDTOs) throws Exception {
        if ( facultadDTOs == null ) {
            return null;
        }

        List<Facultad> list = new ArrayList<Facultad>( facultadDTOs.size() );
        for ( FacultadDTO facultadDTO : facultadDTOs ) {
            list.add( facultadDTOToFacultad( facultadDTO ) );
        }

        return list;
    }
}
