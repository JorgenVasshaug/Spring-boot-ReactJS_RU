package org.vasshaug.demicontt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.vasshaug.demicontt.domain.string.RawString;

public interface RawStringRepository extends JpaRepository<RawString, Long> {
}
