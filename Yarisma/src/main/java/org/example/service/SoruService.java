package org.example.service;

import lombok.RequiredArgsConstructor;
import org.example.repository.SoruRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SoruService {
    private final SoruRepository soruRepository;
}
