package org.example.repository;

import org.example.entity.Soru;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SoruRepository extends JpaRepository<Soru,Long> {
}
