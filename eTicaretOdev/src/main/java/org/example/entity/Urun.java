package org.example.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.utility.enums.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Urun {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String ad;

    private String kategori;

    private String aciklama;

    private double fiyat;

    private int stok;

    @Enumerated(EnumType.STRING)
    private Beden beden;

    @Enumerated(EnumType.STRING)
    private Cinsiyet cinsiyet;

    @Enumerated(EnumType.STRING)
    private Kalip kalip;

    @Enumerated(EnumType.STRING)
    private KumasTipi kumasTipi;

    @Enumerated(EnumType.STRING)
    private Renk renk;

    @ManyToOne(cascade = CascadeType.ALL)
    private Marka marka;

    @ManyToOne(cascade = CascadeType.ALL)
    private Model model;

}
