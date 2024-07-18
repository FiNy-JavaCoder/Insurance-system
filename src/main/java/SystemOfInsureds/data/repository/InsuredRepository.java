package SystemOfInsureds.data.repository;

import SystemOfInsureds.data.entities.InsuredEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InsuredRepository extends JpaRepository<InsuredEntity, Long> {
}
