package at.spengergasse.vorstudiearbeit.Repository;


import at.spengergasse.vorstudiearbeit.entities.User;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserRepository extends CrudRepository<User,Integer> {
    Optional<User> findByEmail(String email);
}
