package br.com.fiap.mscidades.model;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author Bruno Gomes Damascena dos santos (bruno-gds) < brunog.damascena@gmail.com >
 * Date: 04/03/2024
 * Project Name: mscidades
 */

@Data
@AllArgsConstructor
public class Cidade {

    private int id;
    private String nome;
    private String país;
    private String descricao;
}
