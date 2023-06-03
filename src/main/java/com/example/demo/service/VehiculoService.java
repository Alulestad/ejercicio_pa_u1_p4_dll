package com.example.demo.service;

import com.example.demo.repo.modelo.Vehiculo;

public interface VehiculoService {

	//CRUD insertar, seleccionar, actualizar, elimnar
	
	public void agregar(Vehiculo vehiculo);
	public Vehiculo buscarPorPlaca(String placa);
	public void actualizar(Vehiculo vehiculo);
	public void eliminarPorPlaca(String placa);
	
}
