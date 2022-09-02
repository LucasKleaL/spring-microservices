package pucpr.jwtservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pucpr.jwtservice.entity.User;

public interface UserRepository extends JpaRepository<User, String> {
    User findByUsername(String username);
}
