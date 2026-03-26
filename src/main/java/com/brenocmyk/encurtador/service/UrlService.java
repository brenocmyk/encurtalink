package com.brenocmyk.encurtador.service;

import com.brenocmyk.encurtador.model.UrlMapping;
import com.brenocmyk.encurtador.repository.UrlMappingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
public class UrlService {

    @Autowired
    private UrlMappingRepository repository;
    public UrlMapping encurtarUrl(String urlOriginal) {
        String codigoGerado = UUID.randomUUID().toString().substring(0, 6);
        UrlMapping novaUrl = new UrlMapping(urlOriginal, codigoGerado);
        return repository.save(novaUrl);
    }

    public Optional<UrlMapping> obterUrlOriginal(String codigoCurto) {
        return repository.findByCodigoCurto(codigoCurto);
    }
}