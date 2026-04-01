package io.github.Dfcreis.estudosAPI.controller;

import io.github.Dfcreis.estudosAPI.domain.Anime;
import io.github.Dfcreis.estudosAPI.util.DateUtil;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;




@RestController// Anotação para indicar que essa classe é um controlador REST,
// ou seja, ela irá lidar com requisições HTTP e retornar respostas em formato JSON ou XML.

@RequestMapping("anime")// Define o caminho base para as rotas deste controlador,
// ou seja, todas as rotas aqui definidas começarão com "/anime".

@Log4j2// Anotação do Lombok para adicionar um logger à classe,
// permitindo registrar mensagens de log de forma fácil e eficiente.

@AllArgsConstructor// Anotação do Lombok para gerar um construtor com um parâmetro
// para cada campo da classe,

//@RequiredArgsConstructor: Anotação do Lombok para gerar um construtor apenas com os campos marcados como final,

public class  AnimeController {

    //@Autowired: Faz a injeção automática de dependência. O Spring fornece uma instância do Bean correspondente.
    private final DateUtil dateUtil;


    //localhost:8080/anime/list
    @GetMapping(path = "list")
    public List<Anime> listAnimes(){
        log.info(dateUtil.formatDateTimeToDateBaseStyle((LocalDateTime.now())));
        return List.of(new Anime("Berserk"), new Anime("One Piece"));
    }




}
