package com.treinamento.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.treinamento.dto.GameListDTO;
import com.treinamento.dto.GameMinDTO;
import com.treinamento.entitys.Game;
import com.treinamento.entitys.GameList;
import com.treinamento.repositories.GameListRepository;

@Service
public class GameListService {
	@Autowired
	private GameListRepository gameListRepository;
	
	@Transactional(readOnly = true)
	public List<GameListDTO>findAll(){
		List<GameList>result = gameListRepository.findAll();
		List<GameListDTO> dto = result.stream().map(x-> new GameListDTO(x)).toList();
		return dto;
	}
	
}
