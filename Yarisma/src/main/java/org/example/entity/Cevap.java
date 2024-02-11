package org.example.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "tbl_cevap")
@Entity
public class Cevap {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String cevap;
    String secenekNo;
    boolean dogruCevap;

}
