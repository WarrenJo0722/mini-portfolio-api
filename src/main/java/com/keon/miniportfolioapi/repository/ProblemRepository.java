package com.keon.miniportfolioapi.repository;

import com.keon.miniportfolioapi.entity.Problem;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProblemRepository extends JpaRepository<Problem, Long> {
    List<Problem> findAllByOrderByCreatedAtDesc();
}