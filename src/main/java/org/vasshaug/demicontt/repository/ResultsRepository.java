package org.vasshaug.demicontt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.vasshaug.demicontt.domain.Result;

public interface ResultsRepository extends JpaRepository<Result, Long> {
}