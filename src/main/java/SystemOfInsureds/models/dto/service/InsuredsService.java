package SystemOfInsureds.models.dto.service;

import SystemOfInsureds.models.dto.InsuredPersonDTO;
import SystemOfInsureds.models.dto.InsuredPersonDTOFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.time.LocalDate;
import java.util.List;

public interface InsuredsService {

    void create(InsuredPersonDTO insuredPerson_DTO);


    List<InsuredPersonDTO> getAllInsureds();

  InsuredPersonDTO getById(long insuredId);

    void edit(InsuredPersonDTO insuredPersonDTO);

    void remove(long insuredId);

    boolean existsById(long insuredId);


}
