package com.pokemon.pokemonapi.pokemon;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PokemonService {
    public List<Pokemon> getPokemon() {
        return List.of(new Pokemon(
                1,
                "Pikachu",
                "Electric"));
    }
}
