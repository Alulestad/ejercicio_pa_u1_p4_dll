package com.example.demo.repo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.repo.modelo.Propietario;


@Repository
public class PropietarioRepoImpl implements PropietarioRepo {

	private static List<Propietario> baseDatos= new ArrayList<>();
	
	@Override
	public void insertar(Propietario propietario) {
		// TODO Auto-generated method stub
		
		baseDatos.add(propietario);

	}

	@Override
	public void eliminar(String identificaion) {
		
		Propietario propietario=this.seleccionarPorIdentificacion(identificaion);
		
		baseDatos.remove(propietario);		
		

	}

	@Override
	public Propietario seleccionarPorIdentificacion(String identificaion) {
		// TODO Auto-generated method stub
		Propietario encontrado= new Propietario();
		
		for(Propietario prop:baseDatos) {
			
			if(identificaion.equals(prop.getIdentificacion())) {
				encontrado=prop;
			}
			
		}
		
		
		return encontrado;
	}

}
