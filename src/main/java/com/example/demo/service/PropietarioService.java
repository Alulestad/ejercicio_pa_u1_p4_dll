package com.example.demo.service;

import com.example.demo.repo.modelo.Propietario;

public interface PropietarioService {
	
	
	//crear y eliminar y buscar
	
	public void agregar(Propietario propietario);
	public void eliminar(String identificaion);
	public Propietario buscarPorIdentificacion(String identificaion);

}
