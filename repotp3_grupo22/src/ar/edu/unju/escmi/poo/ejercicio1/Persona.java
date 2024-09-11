package ar.edu.unju.escmi.poo.ejercicio1;

import java.time.LocalDate;

public class Persona {
	
	private String dni;
    private String nombre;
    private LocalDate fechaNacimiento;
    private String domicilio;
    private String provincia;
    
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public String getDomicilio() {
		return domicilio;
	}
	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}
	public String getProvincia() {
		return provincia;
	}
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
    	
	 public Persona() {
	    }

	public Persona(String dni, String nombre, LocalDate fechaNacimiento, String domicilio, String provincia) {
	    this.dni = dni;
	    this.nombre = nombre;
	    this.fechaNacimiento = fechaNacimiento;
	    this.domicilio = domicilio;
	    this.provincia = provincia;
	    }

	    public Persona(String dni, String nombre, LocalDate fechaNacimiento) {
	    this.dni = dni;
	    this.nombre = nombre;
	    this.fechaNacimiento = fechaNacimiento;
	    this.provincia = "Jujuy";
	    this.domicilio = null;
	    }
}
