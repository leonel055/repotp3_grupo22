package ar.edu.unju.escmi.poo.ejercicio1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
        ArrayList<Persona> personas = new ArrayList<>();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        int opcion;

        do {
        
            System.out.println("******** MENU ********");
            System.out.println("1. Crear objeto con Constructor por defecto");
            System.out.println("2. Crear objeto con Constructor parametrizado");
            System.out.println("3. Crear objeto con Constructor (dni, nombre, fecha de nacimiento)");
            System.out.println("4. Mostrar personas");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    
                    Persona persona1 = new Persona();
                    System.out.print("Ingrese DNI: ");
                    persona1.setDni(sc.nextLine());

                    System.out.print("Ingrese Nombre: ");
                    persona1.setNombre(sc.nextLine());

                    System.out.print("Ingrese Fecha de Nacimiento (DD/MM/YYYY): ");
                    LocalDate fechaNac1 = LocalDate.parse(sc.nextLine(), formatter);
                    persona1.setFechaNacimiento(fechaNac1);

                    System.out.print("Ingrese Domicilio: ");
                    persona1.setDomicilio(sc.nextLine());

                    System.out.print("Ingrese Provincia: ");
                    persona1.setProvincia(sc.nextLine());

                    personas.add(persona1);
                    System.out.println("\nSE AGREGO CON EXITO\n");
                    break;

                case 2:
         
                    System.out.print("Ingrese DNI: ");
                    String dni2 = sc.nextLine();

                    System.out.print("Ingrese Nombre: ");
                    String nombre2 = sc.nextLine();

                    System.out.print("Ingrese Fecha de Nacimiento (DD/MM/YYYY): ");
                    LocalDate fechaNacimiento2 = LocalDate.parse(sc.nextLine(), formatter);

                    System.out.print("Ingrese Domicilio: ");
                    String domicilio2 = sc.nextLine();

                    System.out.print("Ingrese Provincia: ");
                    String provincia2 = sc.nextLine();

                    Persona persona2 = new Persona(dni2, nombre2, fechaNacimiento2, domicilio2, provincia2);
                    personas.add(persona2);
                    System.out.println("\nSE AGREGO CON EXITO\n");
                    break;

                case 3:
           
                    System.out.print("Ingrese DNI: ");
                    String dni3 = sc.nextLine();

                    System.out.print("Ingrese Nombre: ");
                    String nombre3 = sc.nextLine();

                    System.out.print("Ingrese Fecha de Nacimiento (DD/MM/YYYY): ");
                    LocalDate fechaNacimiento3 = LocalDate.parse(sc.nextLine(), formatter);

                    Persona persona3 = new Persona(dni3, nombre3, fechaNacimiento3);
                    personas.add(persona3);
                    System.out.println("\nSE AGREGO CON EXITO\n");
                    break;

                case 4:
                	
                    if (personas.isEmpty()) {
                        System.out.println("\nNO HAY PERSONAS\n");
                    } else {
                        System.out.println("\nLISTADO DE PERSONAS\n");
                        for (Persona p : personas) {
                            p.mostrarDatos();
                            System.out.println("------------------");
                        }
                    }
                    break;

                case 5:
                    System.out.println("\nFIN DEL PROGRAMA");
                    break;

                default:
                    System.out.println("\nOPCION INVALIDA\n");
            }

        } while (opcion != 5);

        sc.close();
	}

}
