package com.belicos.proyecto;

import com.belicos.proyecto.entities.Empleado;
import com.belicos.proyecto.entities.Empresa;
import com.belicos.proyecto.entities.MovimientoDinero;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProyectoApplication {

	public static void main(String[] args) {

		//SpringApplication.run(ProyectoApplication.class, args);

		Empresa miempresa= new Empresa(01,"belicos","Cr 4 av Centenario", 3057465217L,12345678910L);
		Empleado miempleado = new Empleado(01,"enuar","enuar@fmail.com",miempresa,"administrador");
		MovimientoDinero miMovimientoDinero = new MovimientoDinero(01, -15000.0,"pago nomina",miempleado);

		System.out.println(miempresa.toString());
		System.out.println(miempleado.toString());
		System.out.println(miempresa.getNombre());

		//System.out.println(miMovimientoDinero.toString());








	}

}
