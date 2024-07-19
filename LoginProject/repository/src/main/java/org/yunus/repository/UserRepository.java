package org.yunus.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.yunus.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByEmail(String email);

}
