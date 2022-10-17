/*
 * Aqui tenemos otro programa que el nombre nos lo da el mismo
 * usuario y con ese mismo nombre que el usuario nos da lo proyectaremos 
 * en salida con "Bienvenido" junto con el nombre introducido.
 */
import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        
        String nombre;

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el nombre: ");
        nombre = sc.nextLine();

        System.out.println("Bienvenido " + nombre);

        sc.close();
    }
}