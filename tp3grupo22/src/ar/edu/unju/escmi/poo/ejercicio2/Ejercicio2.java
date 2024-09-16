package ar.edu.unju.escmi.poo.ejercicio2;

import java.util.Scanner;
import java.util.TreeSet;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        TreeSet<GatoSimple> gatos = new TreeSet<>((g1, g2) -> g1.getNombre().compareToIgnoreCase(g2.getNombre()));
        
        int opcion;
        do {
            System.out.println("1 – Crear gato simple");
            System.out.println("2 – Dar de comer a un gato simple");
            System.out.println("3 – Eliminar un gato simple");
            System.out.println("4 – Mostrar todos los gatos");
            System.out.println("5 – Crear gato contrincante para pelear con un gato simple");
            System.out.println("6 – Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcion) {
                case 1:
                    //Crear gato simple
                    System.out.print("Nombre: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Color: ");
                    String color = scanner.nextLine();
                    System.out.print("Raza: ");
                    String raza = scanner.nextLine();
                    System.out.print("Sexo (macho/hembra): ");
                    String sexo = scanner.nextLine();
                    System.out.print("Edad: ");
                    int edad = scanner.nextInt();
                    System.out.print("Peso: ");
                    double peso = scanner.nextDouble();
                    GatoSimple nuevoGato = new GatoSimple(color, peso, raza, edad, nombre, sexo);
                    gatos.add(nuevoGato);
                    System.out.println("Gato creado y agregado al conjunto.");
                    break;

                case 2:
                    //Dar de comer a un gato
                    System.out.print("Nombre del gato: ");
                    String nombreGatoComer = scanner.nextLine();
                    GatoSimple gatoComer = buscarGato(gatos, nombreGatoComer);
                    if (gatoComer != null) {
                        System.out.print("Comida: ");
                        String comida = scanner.nextLine();
                        gatoComer.comer(comida);
                    } else {
                        System.out.println("Gato no encontrado.");
                    }
                    break;

                case 3:
                    //Eliminar gato
                    System.out.print("Nombre del gato a eliminar: ");
                    String nombreEliminar = scanner.nextLine();
                    GatoSimple gatoEliminar = buscarGato(gatos, nombreEliminar);
                    if (gatoEliminar != null) {
                        gatos.remove(gatoEliminar);
                        System.out.println("Gato eliminado.");
                    } else {
                        System.out.println("Gato no encontrado.");
                    }
                    break;

                case 4:
                    //Mostrar todos los gatos
                    for (GatoSimple gato : gatos) {
                        System.out.println("Nombre: " + gato.getNombre() +
                                           ", Color: " + gato.getColor() +
                                           ", Raza: " + gato.getRaza() +
                                           ", Edad: " + gato.getEdad() +
                                           ", Peso: " + gato.getPeso() +
                                           ", Sexo: " + gato.getSexo());
                        gato.maullar();
                        gato.ronronear();
                    }
                    break;

                case 5:
                    //Pelear con un gato contrincante
                    System.out.print("Nombre del gato contrincante: ");
                    String nombreContrincante = scanner.nextLine();
                    System.out.print("Color: ");
                    String colorContrincante = scanner.nextLine();
                    System.out.print("Raza: ");
                    String razaContrincante = scanner.nextLine();
                    System.out.print("Sexo (macho/hembra): ");
                    String sexoContrincante = scanner.nextLine();
                    System.out.print("Edad: ");
                    int edadContrincante = scanner.nextInt();
                    System.out.print("Peso: ");
                    double pesoContrincante = scanner.nextDouble();
                    GatoSimple gatoContrincante = new GatoSimple(colorContrincante, pesoContrincante, razaContrincante, edadContrincante, nombreContrincante, sexoContrincante);
                    gatos.add(gatoContrincante);

                    System.out.print("Nombre del gato con el que peleará: ");
                    scanner.nextLine(); // 
                    String nombrePelea = scanner.nextLine();
                    GatoSimple gatoPelea = buscarGato(gatos, nombrePelea);
                    if (gatoPelea != null) {
                        gatoPelea.pelear(gatoContrincante);
                    } else {
                        System.out.println("Gato no encontrado.");
                    }
                    break;

                case 6:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 6);
    }

    public static GatoSimple buscarGato(TreeSet<GatoSimple> gatos, String nombre) {
        for (GatoSimple gato : gatos) {
            if (gato.getNombre().equalsIgnoreCase(nombre)) {
                return gato;
            }
        }
        return null;
	}

}