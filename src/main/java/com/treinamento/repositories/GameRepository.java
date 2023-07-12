package com.treinamento.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.treinamento.entitys.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
