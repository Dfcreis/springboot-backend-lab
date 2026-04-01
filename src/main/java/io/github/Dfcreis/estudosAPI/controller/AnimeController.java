package io.github.Dfcreis.estudosAPI.controller;

import io.github.Dfcreis.estudosAPI.domain.Anime;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

// Anotação para indicar que essa classe é um controlador REST,
// ou seja, ela irá lidar com requisições HTTP e retornar respostas em formato JSON ou XML.
@RestController

@RequestMapping("anime")// Define o caminho base para as rotas deste controlador,
// ou seja, todas as rotas aqui definidas começarão com "/anime".

public class AnimeController {


    //localhost:8080/anime/list
    @GetMapping(path = "list")
    public List<Anime> listAnimes(){
        return List.of(new Anime("Berserk"), new Anime("One Piece"));
    }

}
