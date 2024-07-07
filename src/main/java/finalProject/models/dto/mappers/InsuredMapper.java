package finalProject.models.dto.mappers;

import finalProject.data.entities.InsuredEntity;
import finalProject.models.dto.InsuredPerson_DTO;
import org.mapstruct.Mapper;


@Mapper(componentModel = "spring")
public interface InsuredMapper {

    InsuredEntity toEntity(InsuredPerson_DTO source);
}
