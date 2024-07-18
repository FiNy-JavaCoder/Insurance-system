package SystemOfInsureds.models.dto.mappers;

import SystemOfInsureds.data.entities.InsuredEntity;
import SystemOfInsureds.models.dto.InsuredPersonDTO;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;


@Mapper(componentModel = "spring")
public interface InsuredMapper {

    InsuredEntity toEntity(InsuredPersonDTO source);

    InsuredPersonDTO toDTO(InsuredEntity source);

    void updateInsuredPersonDTO(InsuredPersonDTO source, @MappingTarget InsuredPersonDTO target);

    void updateInsuredEntity(InsuredPersonDTO source, @MappingTarget InsuredEntity target);
}
