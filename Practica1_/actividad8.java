/*
/
operadoresaritmeticos.java
Programa que muestra el uso de los operadores aritméticos
/
public class operadores aritmeticos {
    public static main ( String [ ] args )
    short x = 7 ;
    int y = 5 ;
    float fl = 13.5 ;
    float f2 = 8f ;
    System.out.println("El valor de x es " , x , " y el valor de y es", y);
    System.out.println("El resultado de x + y es " + (x + y));
    System.out.println("El resultado de x + y es " + (x - y));
    System.out.println(("\n%s%s\n","División entera:","x / y = ",(x/y));
    System.out.println("Resto de la división entera: x % y = " + (x % y));
    System.out.printf("El valor de f1 es %f y el de f2 es %f\n",f1,f2);
    System.out.println("El resultado de f1 / f2 es " + (f1 / f2))


}
*/

operadoresaritmeticos.java;
//Programas que muestra el uso de los operadores aritmérticos

public class operadoresaritmeticos {
    public static void main(String[] args) {
        short x = 7; // short es un número entero corto
        int y = 5; // int es un número entero
        float f1 = 13.5; // float es un número real en coma flotante de precisión simple
        float f2 = 8f;

        System.out.println("El valor de x es " + x + " y el valor de y es" + y); //El error estaba en las concatenaciones.
        System.out.println("El resultado de x + y es " + (x + y)); //No he encontrado el fallo
        System.out.println("El resultado de x + y es " + (x - y)); //No he encontrado el fallo
        System.out.println("%s\n%s%s\n","División entera:","x / y = " + (x/y)); //Le faltaba definir el primer texto que es "División enters" con %s y también falta concatenar.
        System.out.println("Resto de la división entera: x % y = " + (x % y));
        System.out.printf("El valor de f1 es %f y el de f2 es %f\n",f1,f2);
        System.out.println("El resultado de f1 / f2 es " + (f1 / f2)); //Aqui faltaba el punto y coma al final.
        //Luego faltaba cerrar el main también.
    } // fin de main
} // fin de la clase operadoresaritméticos