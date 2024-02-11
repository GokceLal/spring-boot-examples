package org.example.service;


import lombok.RequiredArgsConstructor;
import org.example.entity.Urun;
import org.example.repository.UrunRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UrunService implements IService<Urun, Long> {

    private final UrunRepository urunRepository;


    @Override
    public Urun save(Urun urun) {
        return urunRepository.save(urun);
    }

    @Override
    public Urun update(Urun urun) {
        return null;
    }

    @Override
    public Iterable<Urun> saveAll(Iterable<Urun> t) {
        return null;
    }

    @Override
    public void delete(Urun urun) {

    }

    @Override
    public Optional<Urun> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public boolean existById(Long id) {
        return false;
    }

    @Override
    public List<Urun> findAll() {
        return urunRepository.findAll();
    }

    @Override
    public List<Urun> findByColumnAndValue(String columnName, Object value) {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public List<Urun> findAllEntity(Urun urun) {
        return null;
    }
}