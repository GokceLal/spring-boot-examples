package org.example.controller;

import lombok.RequiredArgsConstructor;
import org.example.controller.dto.UrunRequestDTO;
import org.example.controller.dto.UrunResponseDTO;
import org.example.controller.mapper.UrunMapper;
import org.example.entity.Marka;
import org.example.entity.Model;
import org.example.entity.Urun;
import org.example.service.UrunService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/urun")
@RequiredArgsConstructor
public class UrunController {

    private final UrunService urunService;

    @PostMapping("/save")
    public void save(@RequestBody UrunRequestDTO urunRequestDTO) {
        Urun urun = UrunMapper.INSTANCE.fromDtoToEntity(urunRequestDTO);

        Marka adidas = Marka.builder()
                .ad("Adidas")
                .aciklama("Adidas markası")
                .build();

        Model kazak = Model.builder()
                .ad("Kazaklar")
                .aciklama("Kazak modeli")
                .build();

        urun.setMarka(adidas);
        urun.setModel(kazak);

        urunService.save(urun);

    }


    @GetMapping("/get-all")
    public List<UrunResponseDTO> findAll() {
        //List<Urun> urunList = urunService.findAll();
        //List<UrunResponseDTO> urunResponseDTOList = urunList.stream().map(UrunMapper.INSTANCE::fromEntityToDTO).toList();
        //return urunResponseDTOList;
        return UrunMapper.INSTANCE.fromEntityListToDTOList(urunService.findAll());
    }

    /**
     * http://localhost:8080/ebeveyn/get-all-by-adres
     * GET isteklerinde bilgi transferi isteğin header kısmında taşınır.
     * yani URL adresine bilgi ekleyerek göndermeniz gereklidir. bu işlem
     * end-point in sonuna ? ekleyerek yapılır. ? den sonra gönderilmek istenilen
     * parametrenin adı ? değer şeklinde yazılır.
     *
     * @param adres
     * @return
     */
    //@GetMapping("/get-all-by-adres")
    //public List<Ebeveyn> findAllByAdres(String adres) {
    //    return ebeveynService.findAll()
    //            .stream().filter(x -> x.getAdres().contains(adres))
    //            .toList();
    //}


    /**
     * GET isteklerinde bilgi eklemesi yapılırken, header içinde birden fazla bilgi taşıyabiliriz.
     * Bu bilgileri eklemek için ifadeler arasına & işareti eklenir
     * http://localhost:8080/ebeveyn/get-all-by-adres-and-ad?adres=a&ad=a
     */
    //@GetMapping("/get-all-by-adres-and-ad")
    //public List<Ebeveyn> findAllByAdresAndAd(String adres, String ad) {
    //    return ebeveynService.findAll()
    //            .stream().filter(x -> x.getAdres().contains(adres) && x.getAd().contains(ad))
    //            .toList();
}