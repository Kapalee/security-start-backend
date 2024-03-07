package dat3.security_demo.repository;

import dat3.security_demo.entity.SpecialUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpecialUserRepository extends JpaRepository<SpecialUser, String> {
}
