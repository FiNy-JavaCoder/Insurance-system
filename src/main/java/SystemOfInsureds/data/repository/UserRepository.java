package SystemOfInsureds.data.repository;

import SystemOfInsureds.data.entities.UserEntity;
import org.springframework.data.repository.CrudRepository;


public interface UserRepository extends CrudRepository<UserEntity, Long> {
}
