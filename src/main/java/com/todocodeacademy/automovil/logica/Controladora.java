
package com.todocodeacademy.automovil.logica;

import com.todocodeacademy.automovil.persistecia.ControladoraPersistencia;
import java.util.List;

public class Controladora {
    
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    public void agregarAutomovil(String modelo, String marca, String color, String motor, String patente, int cantidadPuertas) {
	
	Automovil auto = new Automovil();
	auto.setModelo(modelo);
	auto.setMarca(marca);
	auto.setColor(color);
	auto.setMotor(motor);
	auto.setPatente(patente);
	auto.setCantidadPuertas(cantidadPuertas);
	
	controlPersis.agregarAutomovil(auto);
    }

    public List<Automovil> traerAutos() {
	return controlPersis.traerAutos();
    }

    public void borrarAuto(int idAuto) {

	controlPersis.borrarAuto(idAuto);
    }

    public Automovil traerAuto(int idAuto) {
	return controlPersis.traerAuto(idAuto);
    }

    public void modificarAuto(Automovil auto, String modelo, String marca, String color, String motor, String patente, int cantidadPuertas) {
	
	auto.setColor(color);
	auto.setModelo(modelo);
	auto.setMarca(marca);
	auto.setMotor(motor);
	auto.setPatente(patente);
	auto.setCantidadPuertas(cantidadPuertas);

	// la persistencia se encarga de modificar los datos
	controlPersis.modificarAuto(auto);
    }

 


 

  
    
}
