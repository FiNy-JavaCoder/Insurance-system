package SystemOfInsureds.models.dto.mappers;

import SystemOfInsureds.data.entities.InsuredEntity;
import SystemOfInsureds.models.dto.InsuredPersonDTO;
import org.mapstruct.Mapper;


@Mapper(componentModel = "spring")
public interface InsuredMapper {

    InsuredEntity toEntity(InsuredPersonDTO source);

    InsuredPersonDTO toDTO(InsuredEntity source);
}
