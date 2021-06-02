package io.hieule.travelyapp.repository;

import io.hieule.travelyapp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
