package musicshop.repositories;

import musicshop.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User FindFirstByName(String name);
}
