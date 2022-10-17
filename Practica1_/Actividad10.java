public class Actividad10 {
    public static void main(String[] args) { //Clase principal main
        
        //Sólo puede tener 2 valores, true o false.
        boolean casado = true;
        //Con final declaramos la variable como constante, el tipo int tiene un rango de -2.147.483.648 a 2.147.483.647.
        final int maximo = 999999;
        //Los días del año será como máximo 366 días, cosa que no puede ser "byte" ya que el rango es de -128 a 127 por lo que tiene que ser del tipo "short" que tiene un rango de -32.768 a 32.767
        short diasAnio = 300;
        long milisegundos = 1644364800L; // 1970 - 2022 = 52 * 366 = 19.032 * 24 = 456.768 * 60 = 27.406.080 * 60 = 1.644.364.800
        //Se expresa con byte ya que es suficiente ya que no almacena demasiado rango de numeros, ya que va del 1 al 7. Y su rango va de -127 a 128.
        byte diasemana[] = {1,2,3,4,5,6,7};
        //Valor de tipo numerado con 2 posibles valores, hombre o mujer.
        enum SexoPerson{Varon,Mujer}
        SexoPerson varon = SexoPerson.Varon;
        SexoPerson mujer = SexoPerson.Mujer;
        //Son suficiente con los decimales que nos da el rango float. Para representar un valor monetario con 2 decimales.
        float totalFactura = (float) 10350.678;
        //La población mundial está cerca de los 8.000.000.000 por lo que no es suficiente con el rango de "int" ya que su rango no llega ni a 3.000.000.000, por eso colocamos "long" ya que su rango es -9,223,372,036,854,775,808 a 9,223,372,036,854,775,807.
        long poblaconMundial = 7993612869L;
        
        //Variables con println
      System.out.println("El valor de la variable casado es " + casado);
      System.out.println("\tEl valor de la variable MAXIMO es " + maximo);
      System.out.println("\tEl valor de la variable diasem es " + diasemana[0]);
      System.out.println("\tEl valor de la variable diaanual es " + diasAnio);
      System.out.println("\tEl valor de la variable miliseg es " + milisegundos);
      System.out.println("\tEl valor de la variable totalfactura es " + totalFactura);
      System.out.println("\tEl valor de la variable poblacion es " + poblaconMundial);
      System.out.println("\tEl valor de la variable sexo es " + varon.name());
      System.out.println("\tEl valor de la variable sexo es " + mujer.name());

      //Variables con print
      System.out.print("El valor de la variable casado es " + casado);
      System.out.print("\n\tEl valor de la variable MAXIMO es " + maximo);
      System.out.print("\n\tEl valor de la variable diasem es " + diasemana[0]);
      System.out.print("\n\tEl valor de la variable diaanual es " + diasAnio);
      System.out.print("\n\tEl valor de la variable miliseg es " + milisegundos);
      System.out.print("\n\tEl valor de la variable totalfactura es " + totalFactura);
      System.out.print("\n\tEl valor de la variable poblacion es " + poblaconMundial);
      System.out.print("\n\tEl valor de la variable sexo es " + varon.name());
      System.out.print("\n\tEl valor de la variable sexo es " + mujer.name());

    } //Cierre de la clase main
} //Cierre de la clase ejerciciovariables