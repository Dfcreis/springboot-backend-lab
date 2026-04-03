package io.github.Dfcreis.estudosAPI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication//Anotação para indicar que esta classe é a classe principal de configuração do Spring Boot,
// ou seja, ela é responsável por iniciar a aplicação e configurar os componentes do Spring.


//@ComponentScan(basePackages = "io.github.Dfcreis.estudosAPI")
// Especifica os pacotes onde o Spring deve procurar por componentes, como controladores, serviços, repositórios, etc.
// Neste caso, ele irá escanear o pacote "io.github.Dfcreis.estudosAPI" e seus subpacotes para encontrar os componentes do Spring.
public class ApplicationStart {


    public static void main(String[] args) {
        SpringApplication.run(ApplicationStart.class, args);
    }
}
