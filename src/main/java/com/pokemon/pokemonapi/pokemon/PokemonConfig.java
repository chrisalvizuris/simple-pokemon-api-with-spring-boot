package com.pokemon.pokemonapi.pokemon;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class PokemonConfig {

    @Bean
    CommandLineRunner commandLineRunner(PokemonRepository repository) {
        return args -> {
            Pokemon pikachu = new Pokemon(
                    "Pikachu",
                    "Electric"
            );
            Pokemon charmander = new Pokemon(
                    "Charmander",
                    "Fire"
            );

            repository.saveAll(
                    List.of(pikachu, charmander)
            );
        };
    }
}
