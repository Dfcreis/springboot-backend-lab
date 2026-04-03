package io.github.Dfcreis.estudosAPI.repository;

import io.github.Dfcreis.estudosAPI.domain.Anime;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository// Anotação para indicar que esta classe é um repositório, ou seja,
// ela é responsável por acessar os dados da aplicação, como bancos de dados, arquivos, etc
public interface AnimeRepository {
    List<Anime>listAll();
}
