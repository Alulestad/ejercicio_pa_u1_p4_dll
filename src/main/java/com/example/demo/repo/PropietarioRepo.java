package com.example.demo.repo;

import com.example.demo.repo.modelo.Propietario;

public interface PropietarioRepo {
	
	
	//crear y eliminar y buscar
	
	public void insertar(Propietario propietario);
	public void eliminar(String identificaion);
	public Propietario seleccionarPorIdentificacion(String identificaion);

}
