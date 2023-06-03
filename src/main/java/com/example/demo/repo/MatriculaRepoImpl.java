package com.example.demo.repo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.repo.modelo.Matricula;

@Repository
public class MatriculaRepoImpl implements MatriculaRepo {

	private static List<Matricula> baseDatos=new ArrayList<>();
	
	@Override
	public void insertar(Matricula matricula) {
		// TODO Auto-generated method stub
		baseDatos.add(matricula);
	}

	@Override
	public List<Matricula> seleccionarTodos() {
		// TODO Auto-generated method stub
		return baseDatos;
	}

}
