import java.util.Random;
import java.util.Scanner;


public class Aleatorio {
public static void main(String[] args) {

    Scanner teclado = new Scanner(System.in);
    int numeroAleatorio = new Random(0).nextInt(100);
    int intentos = 0;

    while (intentos < 5) {
        System.out.println("Intenta adivinar el numero Aleatorio del 0 al 100");
        int numeroUsuario = teclado.nextInt();
        intentos++;

        if (numeroUsuario == numeroAleatorio) {
            System.out.println("Felicidades has adivinado el numero!" + intentos + "intentos!");
            // interrumpe el loop while
        } else if (numeroUsuario > numeroAleatorio) {
            System.out.println("El numero es menor");
        } else if (numeroUsuario < numeroAleatorio) {
            System.out.println("El numero es mayor");
        }
    }

    if (intentos == 5) {
        System.out.println("Lo siento no conseguiste adivinar el numero. El numero era " + numeroAleatorio);
    }
}

}