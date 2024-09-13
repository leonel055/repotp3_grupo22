package ar.edu.unju.escmi.poo.ejercicio3;

public class Empleado {
    private String nombre;
    private int legajo;
    private double salario;

    public static final double SALARIO_MINIMO = 300000.00;
    public static final double AUMENTO_POR_MERITOS = 10000.00;

    public Empleado(String nombre, int legajo, double salario) {
        this.nombre = nombre;
        this.legajo = legajo;

        if (salario >= SALARIO_MINIMO) {
            this.salario = salario;
        } 
        else 
        {
            this.salario = SALARIO_MINIMO;
        }
    }

    
    
    public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public int getLegajo() {
		return legajo;
	}



	public void setLegajo(int legajo) {
		this.legajo = legajo;
	}



	public double getSalario() {
		return salario;
	}



	public void setSalario(double salario) {
		this.salario = salario;
	}



	public static double getSalarioMinimo() {
		return SALARIO_MINIMO;
	}



	public static double getAumentoPorMeritos() {
		return AUMENTO_POR_MERITOS;
	}



	public void mostrarDatos() {
        System.out.println("Nombre del empleado: " + nombre);
        System.out.println("Legajo: " + legajo);
        System.out.println("Salario $: " + String.format("%.2f", salario));
    }

    public void aumentarSalarioPorMeritos() {
        this.salario += AUMENTO_POR_MERITOS;
    }
    
}
