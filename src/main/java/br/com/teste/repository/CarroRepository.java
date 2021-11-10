package br.com.teste.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.teste.entity.Carro;

@Repository
public interface CarroRepository extends JpaRepository<Carro, Integer> {
	
	@Procedure("GET_QUANT_CARROS")
	Integer getQuantidadeCarros();
	
	@Query(value= "CALL GET_CARRO_BY_ID(:id);", nativeQuery = true)
	Optional<Carro> getCarroById(@Param("id") Integer id);
	
	@Query(value= "CALL GET_CARROS();", nativeQuery = true)
	List<Carro> getCarros();
		
	
}
