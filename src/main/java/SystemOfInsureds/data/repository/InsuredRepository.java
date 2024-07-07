package SystemOfInsureds.data.repository;

import SystemOfInsureds.data.entities.InsuredEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface InsuredRepository extends JpaRepository<InsuredEntity, Long> {
}
