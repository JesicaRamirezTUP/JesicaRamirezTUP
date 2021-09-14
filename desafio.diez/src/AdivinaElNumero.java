import java.util.Random;
import java.util.Scanner;

public class AdivinaElNumero {

    public static void main(String[] args) {
        Scanner io = new Scanner(System.in);
        int numeroAleatorio = 0;
        int entrada = 0;
        int intentos = 0;
        Random rd = new Random();
        numeroAleatorio = rd.nextInt(100) + 1;
        System.out.println("Adivina cual fue el nro generado!!!! ");
        while (numeroAleatorio != (entrada = io.nextInt())){
            if (entrada < numeroAleatorio) {
                System.out.println("No has acertado, el número es mayor. Prueba otra vez: ");
            } else {
                System.out.println("No has acertado, el número es menor. Prueba otra vez: ");
            }
            System.out.println("Intentos fallados: "+ ++intentos);
        }
        System.out.println("LO HAS ADIVINADO en "+intentos+" intentos");
    }
}
