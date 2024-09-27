import java.util.Random;
import java.util.Scanner;

public class Juego {
    public static void main(String[] args) {
        Scanner datoIngresado = new Scanner(System.in);
        int numeroMachine = new Random().nextInt(100);
        String mensajeInicial = "Bienvenid@s al juego. Debes adivinar un numero del 1 al 100, por favor escribe un numero en este rango.";
        int numeroJugador = 0;
        int vidas = 5;
        System.out.println(numeroMachine);

        System.out.println(mensajeInicial);





        while (vidas >= 1){
            numeroJugador = datoIngresado.nextInt();

            if (numeroJugador != numeroMachine){
                vidas--;
                System.out.printf("Numero incorrecto! Te quedan %d vidas\n", vidas);
                if (vidas == 0) {
                    System.out.printf("Ya no te quedan vidas. El numero era %d/n", numeroMachine);
                    break;
                }

                if(numeroJugador > numeroMachine){
                    System.out.println("El numero que debes adivinar es menor. Escribe otro numero del 1 al 100");
                } else {
                    System.out.println("El numero que debes adivinar es mayor. Escribe otro numero del 1 al 100");
                }

            } else {
                System.out.println("Numero correcto. Ganaste!");
                break;
            }
        }
    }
}
