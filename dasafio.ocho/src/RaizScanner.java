import java.util.Scanner;

public class RaizScanner {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double numero, raiz_cuadrada;
        System.out.print("Introduce un numero: ");
        numero = in.nextDouble();
        in.nextLine();
        if(numero>=0)
            raiz_cuadrada=Math.sqrt(numero);
        else
        {
            raiz_cuadrada=Math.sqrt(-numero);
            System.out.println("ra\u00EDz imaginaria");
        }
        System.out.println("La raiz de "+numero+" es= " + raiz_cuadrada);
    }

}

