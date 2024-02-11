package org.example.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.utility.enums.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class UrunRequestDTO {

    private String ad;

    private String kategori;

    private String aciklama;

    private double fiyat;

    private int stok;

    private String beden;

    private String cinsiyet;

    private String kalip;

    private String kumasTipi;

    private String renk;
}
