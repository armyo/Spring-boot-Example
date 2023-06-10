package com.iamnbty.training.backend.repository;

import com.iamnbty.training.backend.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends CrudRepository<User, String> {

    Optional<User> findByEmail(String s);

    boolean existsByEmail(String email);
}
