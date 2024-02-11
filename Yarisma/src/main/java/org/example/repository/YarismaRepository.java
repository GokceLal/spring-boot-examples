package org.example.repository;

import org.example.entity.YarismaUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface YarismaRepository extends JpaRepository<YarismaUser,Long> {
}
