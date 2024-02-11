package org.example.service;

import lombok.RequiredArgsConstructor;
import org.example.repository.CevapRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CevapService {
    private final CevapRepository cevapRepository;
}
