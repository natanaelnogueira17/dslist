package com.treinamento.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.treinamento.dto.GameListDTO;
import com.treinamento.dto.GameMinDTO;
import com.treinamento.service.GameListService;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {
	
	@Autowired
	private GameListService gameListService;

	
	@GetMapping
	public List<GameListDTO>findAll(){
		List<GameListDTO>result = gameListService.findAll();
		return result;
	}
}
