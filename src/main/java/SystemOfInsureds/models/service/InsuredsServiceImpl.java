package SystemOfInsureds.models.service;

import SystemOfInsureds.data.repository.InsuredRepository;
import SystemOfInsureds.data.entities.InsuredEntity;
import SystemOfInsureds.models.dto.InsuredPersonDTO;
import SystemOfInsureds.models.dto.mappers.InsuredMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class InsuredsServiceImpl implements InsuredsService {

    @Autowired
    private InsuredRepository insuredRepository;

    @Autowired
    private InsuredMapper insuredMapper;

    @Override
    public void create(InsuredPersonDTO insuredPersonDTO) {
        InsuredEntity newInsuredEntity = insuredMapper.toEntity(insuredPersonDTO);
        insuredRepository.save(newInsuredEntity);
    }

    @Override
    public List<InsuredPersonDTO> getAllInsureds() {
        return insuredRepository.findAll().stream()
                .map(insuredMapper::toDTO)
                .toList();
    }

    @Override
    public InsuredPersonDTO getById(long insuredId) {
        InsuredEntity fetchedInsuredPerson = getInsuredPersonIdOrThrow(insuredId);
        return insuredMapper.toDTO(fetchedInsuredPerson);
    }

    @Override
    public void edit(InsuredPersonDTO insuredPersonDTO) {
        InsuredEntity fetchedInsuredPerson = getInsuredPersonIdOrThrow(insuredPersonDTO.getInsuredId());

        insuredMapper.updateInsuredEntity(insuredPersonDTO, fetchedInsuredPerson);
        insuredRepository.save(fetchedInsuredPerson);
    }

    private InsuredEntity getInsuredPersonIdOrThrow(long insuredId) {
        return insuredRepository.findById(insuredId).orElseThrow();
    }

}
