package com.brenocmyk.encurtador.repository;

import com.brenocmyk.encurtador.model.UrlMapping;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UrlMappingRepository extends JpaRepository<UrlMapping, Long> {

    Optional<UrlMapping> findByCodigoCurto(String codigoCurto);
}