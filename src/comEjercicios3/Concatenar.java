package comEjercicios3;

public class Concatenar {
    /**

     En este ejercicio tenéis que crear un bucle que permita concatenar textos e imprima el resultado final por consola.

     Tened en cuenta que los textos pueden venir de un array de tipo String. Por ejemplo:

     String[] nombres = {"", "", "", ""}

     */

    public static void main(String[] args) {

      String[] textos = {"La naturaleza del dinero: ", " Según Francisco d´Anconia.", " ¿Alguna vez os habéis preguntado cuál es el origen del dinero? El dinero es un instrumento de cambio, que no puede existir a menos que existan bienes producidos y hombres capaces de producirlos.", " El dinero es la forma material del principio que los hombres que desean tratar entre sí deben hacerlo por intercambio y dando valor por valor. El dinero no es el instrumento de mendigos que claman tu producto con lágrimas, ni el de saqueadores que te lo quitan por la fuerza. El dinero lo hacen posible sólo los hombres que producen. ¿Es eso lo que consideráis malvado?", " Cuando aceptas dinero en pago por tu esfuerzo, lo haces sólo con el convencimiento de que lo cambiarás por el producto del esfuerzo de otros. No son los mendigos ni los saqueadores los que dan su valor al dinero. Ni un océano de lágrimas ni todas las armas del mundo pueden transformar esos papeles de tu cartera en el pan que necesitarás para sobrevivir mañana. Esos papeles, que deberían haber sido oro, son una prenda de honor – tu derecho a la energía de los hombres que producen. Tu cartera es tu manifestación de esperanza de que en algún lugar del mundo a tu alrededor hay hombres que no transgredirán ese principio moral que es el origen del dinero. ¿Es eso lo que consideras malvado?", " ¿Has indagado alguna vez el origen de la producción? Mira un generador eléctrico y atrévete a decir que fue creado por el esfuerzo muscular de brutos insensatos. Intenta hacer crecer una semilla de trigo sin el conocimiento que te dejaron los hombres que tuvieron que descubrirlo por primera vez. Trata de obtener tu alimento sólo a base de movimientos físicos – y aprenderás que la mente del hombre es la raíz de todos los bienes producidos y de toda la riqueza que haya existido jamás sobre la Tierra." };

      for (String texto : textos){
          System.out.println(texto);
      }

    }

}
