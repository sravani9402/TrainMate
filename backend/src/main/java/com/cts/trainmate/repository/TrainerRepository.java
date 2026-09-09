package com.cts.trainmate.repository;

import com.cts.trainmate.entity.Trainer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface TrainerRepository extends JpaRepository<Trainer, Long> {
    Optional<User> findByEmail(String email);

    @Query("SELECT u FROM User u WHERE u.email = :identifier OR u.name = :identifier OR u.email LIKE CONCAT(:identifier, '@%')")
    Optional<User> findByIdentifier(@Param("identifier") String identifier);
}
 