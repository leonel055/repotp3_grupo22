package ar.edu.unju.escmi.poo.ejercicio5;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		ArrayList<Producto> productos = new ArrayList<>();
		boolean band=true;
		Scanner sc = new Scanner(System.in);
		
		while(band) {
			System.out.println("1.Alta de producto");
			System.out.println("2.Mostrar productos");
			System.out.println("3.Incrementar precio de productos");
			System.out.println("4.Ordenar");
			System.out.println("5.Filtrar productos");
			System.out.println("6.Salir");
			System.out.print("Ingrese una opcion: ");
			String op = sc.nextLine();
			
			System.out.println();
			
			switch(op) {
			case "1":{			
				System.out.print("Ingrese codigo del producto: ");
				int codigo = sc.nextInt();
				sc.nextLine();
				
				System.out.print("Ingrese la descripcion del producto: ");
				String descripcion = sc.nextLine();
				
				System.out.print("Ingrese precio del producto: ");
				float precio = sc.nextFloat();
				sc.nextLine();
				
				Producto nuevoProducto = new Producto(codigo, descripcion, precio);
				productos.add(nuevoProducto);
				
				System.out.println("\nSe agrego correctamente el producto\n");
				break;
			}
			
			case "2": {
				productos.stream().forEach(producto -> {
		            System.out.println("\nProducto " + producto.getCodigo());
		            System.out.println("Descripcion: " + producto.getDescripcion());
		            System.out.println("Precio: " + producto.getPrecio());
		            System.out.println();
		        });
				break;
			}
			
			case "3": {
				List<Producto> productosAumentados = productos.stream()
				.map(producto -> new Producto(producto.getCodigo(),producto.getDescripcion(),producto.getPrecio()+300.0f))
				.collect(Collectors.toList());
				
				productos.clear();
				productos.addAll(productosAumentados);
				System.out.println("Se incremento el precio de los productos\n");
				break;
			}
			
			case "4": {
				productos.sort(Comparator.comparing(Producto::getCodigo));
				productos.stream().forEach(producto -> {
		            System.out.println("\nProducto " + producto.getCodigo());
		            System.out.println("Descripcion: " + producto.getDescripcion());
		            System.out.println("Precio: " + producto.getPrecio());
		            System.out.println();
		        });
				break;
			}
			case "5": {
				System.out.println("Ingrese un codigo para filtrar los productos");
				int filtro = sc.nextInt();
				sc.nextLine();
				productos.stream().filter(producto -> producto.getCodigo()>filtro).forEach(producto -> {
		            System.out.println("\nProducto " + producto.getCodigo());
		            System.out.println("Descripcion: " + producto.getDescripcion());
		            System.out.println("Precio: " + producto.getPrecio());
		            System.out.println();
		        });
				break;
			}
			
			case "6": {
				band=false;
				System.out.println("\nFIN DEL PROGRAMA\n");
				break;
			}
			default : System.out.println("Opcion no disponible \n");
			}
		}
		
		sc.close();
	}

}
