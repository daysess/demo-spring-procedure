package br.com.teste.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.teste.entity.Carro;
import br.com.teste.repository.CarroRepository;

@Service
public class CarroService {

	@Autowired
	private CarroRepository carroRepository;
	
	public Integer getQuantidadeCarros() {
		return carroRepository.getQuantidadeCarros();
	}
	
	public Optional<Carro> getCarroById(Integer id) {
		return carroRepository.getCarroById(id);
	}
	
	
	public List<Carro> getCarros() {
		return carroRepository.getCarros();
	}
	
	public List<Carro> findCarros() {
		return carroRepository.findAll();
	}
	
	
	
}
