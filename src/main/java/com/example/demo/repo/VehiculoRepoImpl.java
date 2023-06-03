package com.example.demo.repo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.repo.modelo.Vehiculo;

@Repository
public class VehiculoRepoImpl implements VehiculoRepo {
	private static List<Vehiculo> baseDatos= new ArrayList<>();

	@Override
	public void insertar(Vehiculo vehiculo) {
		baseDatos.add(vehiculo);

	}

	@Override
	public Vehiculo selccionarPorPlaca(String placa) {
		Vehiculo encontrado= new Vehiculo();
		
		for(Vehiculo vehi:baseDatos) {
			
			if(placa.equals(vehi.getPlaca())) {
				encontrado=vehi;
			}
			
		}
		
		
		
		
		return encontrado;
	}

	@Override
	public void actualizar(Vehiculo vehiculo) {
		
		Vehiculo vehiculo2=this.selccionarPorPlaca(vehiculo.getPlaca());
		
		baseDatos.remove(vehiculo2);
		baseDatos.add(vehiculo);

	}

	@Override
	public void elimnarPorPlaca(String placa) {
		Vehiculo vehiculo=this.selccionarPorPlaca(placa);

		baseDatos.remove(vehiculo);
	}

}
