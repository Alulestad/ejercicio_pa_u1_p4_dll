package com.example.demo.repo;

import com.example.demo.repo.modelo.Vehiculo;

public interface VehiculoRepo {

	//CRUD insertar, seleccionar, actualizar, elimnar
	
	public void insertar(Vehiculo vehiculo);
	public Vehiculo selccionarPorPlaca(String placa);
	public void actualizar(Vehiculo vehiculo);
	public void elimnarPorPlaca(String placa);
	
}
