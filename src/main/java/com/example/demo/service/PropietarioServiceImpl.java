package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repo.PropietarioRepo;
import com.example.demo.repo.modelo.Propietario;

@Service
public class PropietarioServiceImpl implements PropietarioService {

	@Autowired
	private PropietarioRepo propietarioRepo;
	
	@Override
	public void agregar(Propietario propietario) {
		// TODO Auto-generated method stub
		propietarioRepo.insertar(propietario);

	}

	@Override
	public void eliminar(String identificaion) {
		// TODO Auto-generated method stub
		propietarioRepo.eliminar(identificaion);
	}

	@Override
	public Propietario buscarPorIdentificacion(String identificaion) {
		// TODO Auto-generated method stub
		return propietarioRepo.seleccionarPorIdentificacion(identificaion);
	}

}
