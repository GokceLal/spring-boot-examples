package org.example.repository;

import org.example.entity.YarismaUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface YarismaUserRepository extends JpaRepository<YarismaUser,Long> {
}
