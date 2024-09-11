package ar.edu.unju.escmi.poo.ejercicio1;

import java.time.LocalDate;
import java.time.Period;

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
	    
	    public int calcularEdad() {
	        if (this.fechaNacimiento != null) {
	            return Period.between(this.fechaNacimiento, LocalDate.now()).getYears();
	        } else {
	            return 0; 
	        }
	    }

	    public boolean esMayorDeEdad() {
	        return calcularEdad() >= 18;
	    }
	    
	    public void mostrarDatos() {
	        System.out.println("DNI: " + this.dni);
	        System.out.println("Nombre: " + this.nombre);
	        System.out.println("Fecha de Nacimiento: " + this.fechaNacimiento);
	        System.out.println("Domicilio: " + (this.domicilio != null ? this.domicilio : "NO ESPECIFICADO"));
	        System.out.println("Provincia: " + this.provincia);
	        System.out.println("Edad: " + calcularEdad());
	        if (esMayorDeEdad()) {
	            System.out.println("LA PERSONA ES MAYOR DE EDAD\n");
	        } else {
	            System.out.println("LA PERSONA NO ES MAYOR DE EDAD\n");
	        }
	    }
}
