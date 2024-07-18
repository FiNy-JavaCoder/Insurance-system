package SystemOfInsureds.models.service;

import SystemOfInsureds.models.dto.InsuredPersonDTO;
import SystemOfInsureds.models.dto.InsuredPersonDTOFilter;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface InsuredsService {

    void create(InsuredPersonDTO insuredPerson_DTO);


    List<InsuredPersonDTO> getAllInsureds();

  InsuredPersonDTO getById(long insuredID);

    void edit(InsuredPersonDTO insuredPersonDTO);
/*
  InsuredPersonDTOFilter createFilter(InsuredPersonDTOFilter insuredPersonDTOFilter);

 */

}
