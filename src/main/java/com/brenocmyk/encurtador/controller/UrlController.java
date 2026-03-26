package com.brenocmyk.encurtador.controller;

import com.brenocmyk.encurtador.model.UrlMapping;
import com.brenocmyk.encurtador.service.UrlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

@Controller
public class UrlController {

    @Autowired
    private UrlService urlService;

    @Value("${APP_BASE_URL:http://localhost:8080}")
    private String baseUrl;

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @PostMapping("/encurtar")
    public String encurtar(@RequestParam("urlOriginal") String urlOriginal, Model model) {
        UrlMapping urlEncurtada = urlService.encurtarUrl(urlOriginal);
        String linkCompleto = baseUrl + "/" + urlEncurtada.getCodigoCurto();
        model.addAttribute("linkGerado", linkCompleto);
        return "index";
    }

    @GetMapping("/{codigoCurto}")
    public String redirecionar(@PathVariable String codigoCurto) {
        Optional<UrlMapping> urlMapping = urlService.obterUrlOriginal(codigoCurto);
        if (urlMapping.isPresent()) {
            return "redirect:" + urlMapping.get().getUrlOriginal();
        } else {
            return "redirect:/";
        }
    }
}