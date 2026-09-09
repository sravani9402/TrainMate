package com.cts.trainmate.repository;

import com.cts.trainmate.entity.Cohort;
import com.cts.trainmate.entity.CohortStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Repository
public interface CohortRepository extends JpaRepository<Cohort, Long> {
    
}
