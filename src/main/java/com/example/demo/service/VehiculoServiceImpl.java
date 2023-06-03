package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repo.VehiculoRepo;
import com.example.demo.repo.modelo.Vehiculo;


@Service
public class VehiculoServiceImpl implements VehiculoService {
	@Autowired
	private VehiculoRepo vehiculoRepo;
	
	
	@Override
	public void agregar(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		vehiculoRepo.insertar(vehiculo);

	}

	@Override
	public Vehiculo buscarPorPlaca(String placa) {
		// TODO Auto-generated method stub
		return vehiculoRepo.selccionarPorPlaca(placa);
	}

	@Override
	public void actualizar(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		vehiculoRepo.actualizar(vehiculo);
	}

	@Override
	public void eliminarPorPlaca(String placa) {
		// TODO Auto-generated method stub
		vehiculoRepo.elimnarPorPlaca(placa);
	}

}
