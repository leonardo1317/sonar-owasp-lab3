package com.vortexbird.sapiens.mapper;

import com.vortexbird.sapiens.domain.Modulo;
import com.vortexbird.sapiens.domain.Programa;
import com.vortexbird.sapiens.domain.ProgramaModulo;
import com.vortexbird.sapiens.dto.ProgramaModuloDTO;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    comments = "version: 1.3.1.Final, compiler: Eclipse JDT (IDE) 1.3.1200.v20200916-0645, environment: Java 15.0.1 (Oracle Corporation)"
)
@Component
public class ProgramaModuloMapperImpl implements ProgramaModuloMapper {

    @Override
    public ProgramaModuloDTO programaModuloToProgramaModuloDTO(ProgramaModulo programaModulo) throws Exception {
        if ( programaModulo == null ) {
            return null;
        }

        ProgramaModuloDTO programaModuloDTO = new ProgramaModuloDTO();

        programaModuloDTO.setProgId_Programa( programaModuloProgramaProgId( programaModulo ) );
        programaModuloDTO.setModuId_Modulo( programaModuloModuloModuId( programaModulo ) );
        programaModuloDTO.setEstadoRegistro( programaModulo.getEstadoRegistro() );
        programaModuloDTO.setFechaCreacion( programaModulo.getFechaCreacion() );
        programaModuloDTO.setFechaModificacion( programaModulo.getFechaModificacion() );
        programaModuloDTO.setPrmoId( programaModulo.getPrmoId() );
        programaModuloDTO.setUsuCreador( programaModulo.getUsuCreador() );
        programaModuloDTO.setUsuModificador( programaModulo.getUsuModificador() );

        return programaModuloDTO;
    }

    @Override
    public ProgramaModulo programaModuloDTOToProgramaModulo(ProgramaModuloDTO programaModuloDTO) throws Exception {
        if ( programaModuloDTO == null ) {
            return null;
        }

        ProgramaModulo programaModulo = new ProgramaModulo();

        programaModulo.setModulo( programaModuloDTOToModulo( programaModuloDTO ) );
        programaModulo.setPrograma( programaModuloDTOToPrograma( programaModuloDTO ) );
        programaModulo.setPrmoId( programaModuloDTO.getPrmoId() );
        programaModulo.setEstadoRegistro( programaModuloDTO.getEstadoRegistro() );
        programaModulo.setFechaCreacion( programaModuloDTO.getFechaCreacion() );
        programaModulo.setFechaModificacion( programaModuloDTO.getFechaModificacion() );
        programaModulo.setUsuCreador( programaModuloDTO.getUsuCreador() );
        programaModulo.setUsuModificador( programaModuloDTO.getUsuModificador() );

        return programaModulo;
    }

    @Override
    public List<ProgramaModuloDTO> listProgramaModuloToListProgramaModuloDTO(List<ProgramaModulo> programaModulos) throws Exception {
        if ( programaModulos == null ) {
            return null;
        }

        List<ProgramaModuloDTO> list = new ArrayList<ProgramaModuloDTO>( programaModulos.size() );
        for ( ProgramaModulo programaModulo : programaModulos ) {
            list.add( programaModuloToProgramaModuloDTO( programaModulo ) );
        }

        return list;
    }

    @Override
    public List<ProgramaModulo> listProgramaModuloDTOToListProgramaModulo(List<ProgramaModuloDTO> programaModuloDTOs) throws Exception {
        if ( programaModuloDTOs == null ) {
            return null;
        }

        List<ProgramaModulo> list = new ArrayList<ProgramaModulo>( programaModuloDTOs.size() );
        for ( ProgramaModuloDTO programaModuloDTO : programaModuloDTOs ) {
            list.add( programaModuloDTOToProgramaModulo( programaModuloDTO ) );
        }

        return list;
    }

    private Integer programaModuloProgramaProgId(ProgramaModulo programaModulo) {
        if ( programaModulo == null ) {
            return null;
        }
        Programa programa = programaModulo.getPrograma();
        if ( programa == null ) {
            return null;
        }
        Integer progId = programa.getProgId();
        if ( progId == null ) {
            return null;
        }
        return progId;
    }

    private Integer programaModuloModuloModuId(ProgramaModulo programaModulo) {
        if ( programaModulo == null ) {
            return null;
        }
        Modulo modulo = programaModulo.getModulo();
        if ( modulo == null ) {
            return null;
        }
        Integer moduId = modulo.getModuId();
        if ( moduId == null ) {
            return null;
        }
        return moduId;
    }

    protected Modulo programaModuloDTOToModulo(ProgramaModuloDTO programaModuloDTO) {
        if ( programaModuloDTO == null ) {
            return null;
        }

        Modulo modulo = new Modulo();

        modulo.setModuId( programaModuloDTO.getModuId_Modulo() );

        return modulo;
    }

    protected Programa programaModuloDTOToPrograma(ProgramaModuloDTO programaModuloDTO) {
        if ( programaModuloDTO == null ) {
            return null;
        }

        Programa programa = new Programa();

        programa.setProgId( programaModuloDTO.getProgId_Programa() );

        return programa;
    }
}
