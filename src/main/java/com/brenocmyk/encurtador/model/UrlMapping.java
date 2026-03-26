package com.brenocmyk.encurtador.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "links")
@Getter
@Setter
@NoArgsConstructor
public class UrlMapping {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 2048)
    private String urlOriginal;

    @Column(nullable = false, unique = true, length = 10)
    private String codigoCurto;

    @Column(nullable = false)
    private LocalDateTime dataCriacao;

    public UrlMapping(String urlOriginal, String codigoCurto) {
        this.urlOriginal = urlOriginal;
        this.codigoCurto = codigoCurto;
        this.dataCriacao = LocalDateTime.now();
    }
}