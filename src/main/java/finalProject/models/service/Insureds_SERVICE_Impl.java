package finalProject.models.service;

import finalProject.data.Repositories.InsuredRepository;
import finalProject.data.entities.InsuredEntity;
import finalProject.models.dto.InsuredPerson_DTO;
import finalProject.models.dto.mappers.InsuredMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Insureds_SERVICE_Impl implements Insureds_SERVICE {

    @Autowired
    private InsuredRepository insuredRepository;

    @Autowired
    InsuredMapper insuredMapper;

    @Override
   public void create(InsuredPerson_DTO insuredPerson_DTO) {
        InsuredEntity newInsuredEntity = insuredMapper.toEntity(insuredPerson_DTO);
        insuredRepository.save(newInsuredEntity);

    }
}
