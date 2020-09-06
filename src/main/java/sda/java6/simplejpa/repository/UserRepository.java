package sda.java6.simplejpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sda.java6.simplejpa.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
