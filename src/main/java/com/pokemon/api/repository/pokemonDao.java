package com.pokemon.api.repository;

import com.pokemon.api.repository.entity.Pokemon;
import org.springframework.data.jpa.repository.JpaRepository;

public interface pokemonDao extends JpaRepository<Integer, Pokemon> {
}
