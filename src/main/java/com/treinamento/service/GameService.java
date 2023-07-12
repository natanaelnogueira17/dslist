package com.treinamento.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.treinamento.dto.GameDTO;
import com.treinamento.dto.GameMinDTO;
import com.treinamento.entitys.Game;
import com.treinamento.projection.GameminProjection;
import com.treinamento.repositories.GameRepository;

@Service
public class GameService {
	@Autowired
	private GameRepository gameRepository;
	
	@Transactional(readOnly = true)
	public List<GameMinDTO>findAll(){
		List<Game>result = gameRepository.findAll();
		List<GameMinDTO> dto = result.stream().map(x-> new GameMinDTO(x)).toList();
		return dto;
	}
	@Transactional(readOnly = true)
	public GameDTO findById(Long id) {
		Game result = gameRepository.findById(id).get();
		GameDTO dto = new GameDTO(result);
		return dto;
	}
	
	@Transactional(readOnly = true)
	public List<GameMinDTO>findByList(Long listId){
		List<GameminProjection>result = gameRepository.searchByList(listId);
		return result.stream().map(x-> new GameMinDTO(x)).toList();
		
	}
	
	
}
