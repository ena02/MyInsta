package com.ena.myinsta.repository;

import com.ena.myinsta.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findUsersByUsername(String username);

    Optional<User> findUsersByEmail(String email);

    Optional<User> findUsersById(Long id);
}
