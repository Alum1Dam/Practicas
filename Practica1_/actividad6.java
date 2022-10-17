import java.util.Scanner;

public class actividad6 {
    public static void main(String[] args) {

        double radio, area;
        Scanner sc = new Scanner(System.in);

        System.out.println("Dime el radio del círculo: ");
        radio = sc.nextDouble();

        //calcular su área. A = PI+r2
        area = Math.PI*radio*2;

        System.out.println("Un círculo de rádio " + radio + " tiene de área: " + area);

        sc.close();
    }
}