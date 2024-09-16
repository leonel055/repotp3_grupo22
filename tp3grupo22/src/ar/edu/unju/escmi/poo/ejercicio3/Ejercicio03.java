package ar.edu.unju.escmi.poo.ejercicio3;

import ar.edu.unju.escmi.poo.ejercicio3.Empleado;
import java.util.HashSet;
import java.util.Scanner;

public class Ejercicio03 {
	
	// HashSet para almacenar los empleados
	private static HashSet<Empleado> empleados = new HashSet<>();
    private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
int opcion = 0;
        
        do {
            mostrarMenu();
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    crearEmpleado();
                    break;
                case 2:
                    aumentarSalario();
                    break;
                case 3:
                    mostrarSumaTotalSalarios();
                    break;
                case 4:
                    mostrarEmpleados();
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida, por favor intente de nuevo.");
            }
        } while (opcion != 5);
    }

    private static void mostrarMenu() {
        System.out.println("\n--- Menú de opciones ---");
        System.out.println("1- Crear empleado");
        System.out.println("2- Aumentar Salario");
        System.out.println("3- Mostrar la suma total de todos los salarios");
        System.out.println("4- Mostrar todos los empleados");
        System.out.println("5- Salir");
        System.out.print("Seleccione una opción: ");
    }

    private static void crearEmpleado() {
        System.out.print("Ingrese el nombre del empleado: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese el número de legajo: ");
        int legajo = scanner.nextInt();

        System.out.print("Ingrese el salario: ");
        double salario = scanner.nextDouble();

        Empleado empleado = new Empleado(nombre, legajo, salario);
        empleados.add(empleado);
        System.out.println("Empleado creado con éxito.");
    }

    private static void aumentarSalario() {
        System.out.print("Ingrese el número de legajo del empleado: ");
        int legajo = scanner.nextInt();

        Empleado empleado = buscarEmpleadoPorLegajo(legajo);

        if (empleado != null) {
            empleado.aumentarSalarioPorMeritos();
            System.out.println("Salario aumentado correctamente.");
        } else {
            System.out.println("Empleado no encontrado.");
        }
    }

    private static void mostrarSumaTotalSalarios() {
        double sumaTotal = 0;
        for (Empleado empleado : empleados) {
            sumaTotal += empleado.getSalario();
        }
        System.out.println("La suma total de los salarios es: $" + String.format("%.2f", sumaTotal));
    }

    private static void mostrarEmpleados() {
        if (empleados.isEmpty()) {
            System.out.println("No hay empleados registrados.");
        } else {
            for (Empleado empleado : empleados) {
                empleado.mostrarDatos();
                System.out.println("-------------------------");
            }
        }
    }

    private static Empleado buscarEmpleadoPorLegajo(int legajo) {
        for (Empleado empleado : empleados) {
            if (empleado.getLegajo() == legajo) {
                return empleado;
            }
        }
        return null;
	}

}
