package ar.edu.unju.escmi.poo.ejercicio4;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        HashMap<String, Cliente> clientes = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Menú de opciones:");
            System.out.println("1 - Alta cliente");
            System.out.println("2 - Mostrar todos los clientes");
            System.out.println("3 - Ingresar clave para eliminar cliente");
            System.out.println("4 - Salir");
            System.out.print("Ingrese una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese DNI: ");
                    String dni = scanner.nextLine();
                    System.out.print("Ingrese nombre: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Ingrese categoría (un solo carácter): ");
                    char categoria = scanner.nextLine().charAt(0);

                    Cliente cliente = new Cliente(dni, nombre, categoria);
                    String clave = dni + categoria;
                    clientes.put(clave, cliente);
                    System.out.println("Cliente agregado con éxito.\n");
                    break;

                case 2:
                    if (clientes.isEmpty()) {
                        System.out.println("No hay clientes para mostrar.\n");
                    } else {
                        Iterator<Map.Entry<String, Cliente>> it = clientes.entrySet().iterator();
                        while (it.hasNext()) {
                            Map.Entry<String, Cliente> entry = it.next();
                            System.out.println("Clave: " + entry.getKey() + 
                                    " -> " + entry.getValue());
                        }
                        System.out.println();
                    }
                    break;

                case 3:
                    System.out.print("Ingrese la clave del cliente a eliminar: ");
                    String claveEliminar = scanner.nextLine();
                    if (clientes.containsKey(claveEliminar)) {
                        clientes.remove(claveEliminar);
                        System.out.println("Cliente eliminado con éxito.\n");
                    } else {
                        System.out.println("La clave no existe.\n");
                    }
                    break;

                case 4:
                    System.out.println("Saliendo del programa.");
                    break;

                default:
                    System.out.println("Opción no válida. Intente de nuevo.\n");
                    break;
            }
        } while (opcion != 4);

        scanner.close();
    }
}
