package com.fsn.poc.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fsn.poc.domain.Fornecedor;
import com.fsn.poc.repositories.FornecedorRepository;
import com.fsn.poc.services.exceptions.ObjectNotFoundException;

@Service
public class FornecedorService {

	@Autowired
	private FornecedorRepository repo;
	
	public Fornecedor find(Integer id) {
		Optional<Fornecedor> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Fornecedor.class.getName()));
	}

	 public List<Fornecedor> findAll() {
		return repo.findAll();
	}	

}
