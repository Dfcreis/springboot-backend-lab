package io.github.Dfcreis.estudosAPI.controller;

import io.github.Dfcreis.estudosAPI.domain.Anime;
import io.github.Dfcreis.estudosAPI.service.AnimeService;
import io.github.Dfcreis.estudosAPI.util.DateUtil;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;




@RestController// Anotação para indicar que essa classe é um controlador REST,
// ou seja, ela irá lidar com requisições HTTP e retornar respostas em formato JSON ou XML.

@RequestMapping("animes")// Define o caminho base para as rotas deste controlador,
// ou seja, todas as rotas aqui definidas começarão com "/anime".

@Log4j2// Anotação do Lombok para adicionar um logger à classe,
// permitindo registrar mensagens de log de forma fácil e eficiente.

//@AllArgsConstructor// Anotação do Lombok para gerar um construtor com um parâmetro
// para cada campo da classe,

@RequiredArgsConstructor// Anotação do Lombok para gerar um construtor apenas com os campos marcados como final,

public class  AnimeController {

    //@Autowired: Faz a injeção automática de dependência. O Spring fornece uma instância do Bean correspondente.
    private final DateUtil dateUtil;
    private final AnimeService animeService;


    //localhost:8080/anime/list
    @GetMapping
    public ResponseEntity<List<Anime>> list(){
        log.info(dateUtil.formatDateTimeToDateBaseStyle((LocalDateTime.now())));
        return new ResponseEntity<>(animeService.listAll(), HttpStatus.OK);
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<Anime> findById(@PathVariable Long id){
        return  ResponseEntity.ok(animeService.findById(id));
    }

    @PostMapping
    public ResponseEntity<Anime> save(@RequestBody Anime anime){
        return new ResponseEntity<>(animeService.save(anime),HttpStatus.CREATED);
    }




}
