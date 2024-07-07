package SystemOfInsureds.models.service;

import SystemOfInsureds.models.dto.InsuredPersonDTO;

import java.util.List;

public interface InsuredsService {

    void create(InsuredPersonDTO insuredPerson_DTO);


    List<InsuredPersonDTO> getAllInsureds();

}
