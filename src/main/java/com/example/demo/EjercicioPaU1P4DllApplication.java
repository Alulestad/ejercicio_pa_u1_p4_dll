package com.example.demo;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.repo.VehiculoRepo;
import com.example.demo.repo.modelo.Propietario;
import com.example.demo.repo.modelo.Vehiculo;
import com.example.demo.service.MatriculaService;
import com.example.demo.service.PropietarioService;
import com.example.demo.service.VehiculoService;

@SpringBootApplication
public class EjercicioPaU1P4DllApplication  implements CommandLineRunner{

	@Autowired
	private VehiculoService vehiculoService;
	
	@Autowired
	private PropietarioService propietarioService;
	
	@Autowired
	private MatriculaService matriculaService;
	
	
	public static void main(String[] args) {
		SpringApplication.run(EjercicioPaU1P4DllApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Ejercicio 1");
		
		Vehiculo vehiculo= new Vehiculo();
		vehiculo.setMarca("Chebrolet");
		vehiculo.setModelo("Cher");
		vehiculo.setPlaca("ABC123");
		vehiculo.setPrecio(new BigDecimal(10000));
		vehiculo.setTipo("automatico");
		vehiculoService.agregar(vehiculo);
		
		
		System.out.println(vehiculoService.buscarPorPlaca("ABC123"));
		vehiculo.setPrecio(new BigDecimal(30000));
		vehiculo.setMarca("otra");
		vehiculoService.actualizar(vehiculo);
		
		//vehiculoService.eliminarPorPlaca("ABC123");
		
		System.out.println(vehiculoService.buscarPorPlaca("ABC123"));
		
		
		Propietario propietario= new Propietario();
		propietario.setApellido("Molina");
		propietario.setFechaNacimiento(LocalDate.now());
		propietario.setIdentificacion("1234");
		propietario.setNombre("Daniel");
		
		
		propietarioService.agregar(propietario);
		
		//propietarioService.eliminar("1234");
		System.out.println(propietarioService.buscarPorIdentificacion("1234"));
		
		
		matriculaService.matricular("ABC123", "1234");
		matriculaService.buscarTodos().forEach(System.out::println);
		
		
		
		
	}
	

}
