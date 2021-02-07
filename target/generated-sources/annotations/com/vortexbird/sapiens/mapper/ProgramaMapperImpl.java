package com.vortexbird.sapiens.mapper;

import com.vortexbird.sapiens.domain.Facultad;
import com.vortexbird.sapiens.domain.Programa;
import com.vortexbird.sapiens.dto.ProgramaDTO;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    comments = "version: 1.3.1.Final, compiler: Eclipse JDT (IDE) 1.3.1200.v20200916-0645, environment: Java 15.0.1 (Oracle Corporation)"
)
@Component
public class ProgramaMapperImpl implements ProgramaMapper {

    @Override
    public ProgramaDTO programaToProgramaDTO(Programa programa) throws Exception {
        if ( programa == null ) {
            return null;
        }

        ProgramaDTO programaDTO = new ProgramaDTO();

        programaDTO.setFacuId_Facultad( programaFacultadFacuId( programa ) );
        programaDTO.setDescripcion( programa.getDescripcion() );
        programaDTO.setEstadoRegistro( programa.getEstadoRegistro() );
        programaDTO.setFechaCreacion( programa.getFechaCreacion() );
        programaDTO.setFechaModificacion( programa.getFechaModificacion() );
        programaDTO.setNombre( programa.getNombre() );
        programaDTO.setProgId( programa.getProgId() );
        programaDTO.setUsuCreador( programa.getUsuCreador() );
        programaDTO.setUsuModificador( programa.getUsuModificador() );

        return programaDTO;
    }

    @Override
    public Programa programaDTOToPrograma(ProgramaDTO programaDTO) throws Exception {
        if ( programaDTO == null ) {
            return null;
        }

        Programa programa = new Programa();

        programa.setFacultad( programaDTOToFacultad( programaDTO ) );
        programa.setProgId( programaDTO.getProgId() );
        programa.setDescripcion( programaDTO.getDescripcion() );
        programa.setEstadoRegistro( programaDTO.getEstadoRegistro() );
        programa.setFechaCreacion( programaDTO.getFechaCreacion() );
        programa.setFechaModificacion( programaDTO.getFechaModificacion() );
        programa.setNombre( programaDTO.getNombre() );
        programa.setUsuCreador( programaDTO.getUsuCreador() );
        programa.setUsuModificador( programaDTO.getUsuModificador() );

        return programa;
    }

    @Override
    public List<ProgramaDTO> listProgramaToListProgramaDTO(List<Programa> programas) throws Exception {
        if ( programas == null ) {
            return null;
        }

        List<ProgramaDTO> list = new ArrayList<ProgramaDTO>( programas.size() );
        for ( Programa programa : programas ) {
            list.add( programaToProgramaDTO( programa ) );
        }

        return list;
    }

    @Override
    public List<Programa> listProgramaDTOToListPrograma(List<ProgramaDTO> programaDTOs) throws Exception {
        if ( programaDTOs == null ) {
            return null;
        }

        List<Programa> list = new ArrayList<Programa>( programaDTOs.size() );
        for ( ProgramaDTO programaDTO : programaDTOs ) {
            list.add( programaDTOToPrograma( programaDTO ) );
        }

        return list;
    }

    private Integer programaFacultadFacuId(Programa programa) {
        if ( programa == null ) {
            return null;
        }
        Facultad facultad = programa.getFacultad();
        if ( facultad == null ) {
            return null;
        }
        Integer facuId = facultad.getFacuId();
        if ( facuId == null ) {
            return null;
        }
        return facuId;
    }

    protected Facultad programaDTOToFacultad(ProgramaDTO programaDTO) {
        if ( programaDTO == null ) {
            return null;
        }

        Facultad facultad = new Facultad();

        facultad.setFacuId( programaDTO.getFacuId_Facultad() );

        return facultad;
    }
}
