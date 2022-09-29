package comEjercicio2;
/*

Función que suma un precio elegido al IVA de Argentina.

 */

import java.util.Scanner;

public class Main {

   public static double calculoIva(double precio) {

       double Iva;
       Iva = precio * 0.21;
       return Iva;
   }

    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);
        double precioSinIva, Iva;

        System.out.print("Introduce un precio sin Iva: ");
        precioSinIva = lector.nextDouble();

        Iva = calculoIva(precioSinIva);

        System.out.println("El precio sin Iva es : " +precioSinIva);
        System.out.println("El precio con Iva es : " +(precioSinIva + Iva));

        }
}

