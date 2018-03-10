package com.gois.dtservicesspring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ServicosController {
    @RequestMapping("/servicos/novo")
    public String novo() {
        return "servico/CadastroServico";
    }
}
