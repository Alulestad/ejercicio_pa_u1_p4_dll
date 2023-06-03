package com.example.demo.service;

import java.math.BigDecimal;
import java.math.MathContext;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repo.MatriculaRepo;
import com.example.demo.repo.modelo.Matricula;
import com.example.demo.repo.modelo.Propietario;
import com.example.demo.repo.modelo.Vehiculo;

@Service
public class MatriculaServiceImpl implements MatriculaService {

	@Autowired
	private MatriculaRepo matriculaRepo;
	
	
	@Autowired
	private PropietarioService propietarioService;
	
	@Autowired
	private VehiculoService vehiculoService;
	
	
	@Override
	public void matricular(String placa, String identifiacion) {
		Propietario propietario= propietarioService.buscarPorIdentificacion(identifiacion);
		Vehiculo vehiculo= vehiculoService.buscarPorPlaca(placa);
		
		BigDecimal precioVehiculo= vehiculo.getPrecio();
		BigDecimal valorMatriculaBruto= new BigDecimal(0);
		
		if (vehiculo.getTipo().equals("manual")) {
			valorMatriculaBruto=precioVehiculo.multiply(new BigDecimal(0.1));
			
		}else { //automatico
			valorMatriculaBruto=precioVehiculo.multiply(new BigDecimal(0.15));
		}
		
		
		if (valorMatriculaBruto.round(MathContext.DECIMAL32 ).compareTo(new BigDecimal(3000))>0) {
			BigDecimal decuento= valorMatriculaBruto.multiply(new BigDecimal(0.09));
			
			valorMatriculaBruto=valorMatriculaBruto.subtract(decuento);
		}
		
		Matricula matricula= new Matricula();
		matricula.setFecha(LocalDateTime.now());
		matricula.setPropietario(propietario);
		matricula.setValor(valorMatriculaBruto);
		matricula.setVehiculo(vehiculo);
		
		matriculaRepo.insertar(matricula);
		

	}

	@Override
	public List<Matricula> buscarTodos() {
		// TODO Auto-generated method stub
		return matriculaRepo.seleccionarTodos();
	}

}
