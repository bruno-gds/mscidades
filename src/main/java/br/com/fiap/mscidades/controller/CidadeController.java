package br.com.fiap.mscidades.controller;

import br.com.fiap.mscidades.model.Cidade;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

/**
 * @author Bruno Gomes Damascena dos santos (bruno-gds) < brunog.damascena@gmail.com >
 * Date: 04/03/2024
 * Project Name: mscidades
 */

@RestController
public class CidadeController {

    private List<Cidade> cidade = Arrays.asList(
            new Cidade(1, "São Paulo", "Brasil", "A capital do estado de SP"),
            new Cidade(2, "Rio de Janeiro", "Brasil", "A capital do estado de RJ"),
            new Cidade(3, "Belo Horizonte", "Brasil", "A capital do estado de MG")
    );

    @GetMapping("/cidades")
    public List<Cidade> listarCidades() {
        return cidade;
    }

    @GetMapping("/cidades/{id}")
    public Cidade getCidade(@PathVariable int id) {
        return cidade.stream().filter(c -> c.getId() == id)
                .findFirst()
                .orElse(null);
    }
}
