package org.example.controller.mapper;

import org.example.controller.dto.UrunRequestDTO;
import org.example.controller.dto.UrunResponseDTO;
import org.example.entity.Urun;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface UrunMapper {

    UrunMapper INSTANCE = Mappers.getMapper(UrunMapper.class);

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "marka", ignore = true)
    @Mapping(target = "model", ignore = true)
    Urun fromDtoToEntity(UrunRequestDTO urunRequestDTO);


    UrunResponseDTO fromEntityToDTO(Urun urun);


    List<UrunResponseDTO> fromEntityListToDTOList(List<Urun> urunList);
}
