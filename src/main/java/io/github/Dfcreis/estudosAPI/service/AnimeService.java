package io.github.Dfcreis.estudosAPI.service;

import io.github.Dfcreis.estudosAPI.domain.Anime;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

@Service// Anotação para indicar que esta classe é um serviço, ou seja,
// ela contém a lógica de negócios da aplicação.
public class AnimeService{
    private static List<Anime> animes ;

    static {
        animes = new ArrayList<> (List.of(new Anime(1L,"Berserk"), new Anime(2L,"One Piece")));
    }

    public List<Anime> listAll(){
        return animes;
    }

    public Anime findById(Long id){
        return animes.stream()
                .filter(anime -> anime.getId().equals(id))
                .findFirst()
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.BAD_REQUEST, "Anime not found"));
    }

    public Anime save(Anime anime ){
        anime.setId(ThreadLocalRandom.current().nextLong(3, 1000));
        animes.add(anime);
        return anime;
    }

}
