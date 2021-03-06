package ru.just.messenger.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import ru.just.messenger.model.User;

/**
 * User repository.
 */
public interface UserRepository extends JpaRepository<User, Long> {

  User findByUsername(String username);

  @Query("SELECT u FROM users u WHERE u.username <> :username")
  List<User> findAllWithout(String username);
}
