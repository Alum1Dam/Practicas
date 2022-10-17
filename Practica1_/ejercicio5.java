import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        
        int a ;
        int area;

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el lado: ");
        a = sc.nextInt();
        area = a * a;

        System.out.println("El area del cuadrado es: " + area);

        sc.close();
    }
}