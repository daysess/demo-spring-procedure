package br.com.teste.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.teste.entity.Carro;
import br.com.teste.service.CarroService;

@RestController
public class CarroController {

	@Autowired
	private CarroService carroService;
	
	@GetMapping(path = "/carros", produces=MediaType.APPLICATION_JSON_VALUE)
	public Integer getQuantidadeCarros() {
		return carroService.getQuantidadeCarros();
	}
	
	@GetMapping(path = "/carroById", produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> getQuantidadeCarros(@RequestParam("id") Integer id) {
		return ResponseEntity.ok(carroService.getCarroById(id));
	}
	
	@GetMapping(path = "/list-carros", produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> getListCarros() {
		return ResponseEntity.ok(carroService.getCarros());
	}
	
	@GetMapping(path = "/find-carros", produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> findAllCarros() {
		return ResponseEntity.ok(carroService.findCarros());
	}
	
}
