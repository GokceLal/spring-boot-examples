package org.example.service;

import lombok.RequiredArgsConstructor;
import org.example.repository.YarismaRepository;
import org.example.repository.YarismaSoruRepository;
import org.example.repository.YarismaUserRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class YarismaService {
    private final YarismaRepository yarismaRepository;
    private final YarismaUserRepository yarismaUserRepository;
    private  final YarismaSoruRepository yarismaSoruRepository;
}
