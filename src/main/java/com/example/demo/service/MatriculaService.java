package com.example.demo.service;

import java.util.List;

import com.example.demo.repo.modelo.Matricula;

public interface MatriculaService {
	
	public void matricular(String placa, String identifiacion);
	public List<Matricula> buscarTodos();

}
