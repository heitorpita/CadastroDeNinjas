package dev.heitor.CadastroDeNinjas;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping

public class NinjaController {

    @GetMapping("/boasVindas")
    public String boasVindas() {
        return "Minha Primeira mensagem";
    }

}
