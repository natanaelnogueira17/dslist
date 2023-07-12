package com.treinamento.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.treinamento.entitys.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{
	
}
