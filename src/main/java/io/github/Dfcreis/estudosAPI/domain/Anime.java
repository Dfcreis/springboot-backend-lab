package io.github.Dfcreis.estudosAPI.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data//Anotacao para indicar a criacao de get e set dos atributos
@AllArgsConstructor//criacao de construtor de todos atributos da classe
public class Anime {

    private Long id;
    private String name;


}
