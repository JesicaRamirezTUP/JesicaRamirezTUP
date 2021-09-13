import java.util.Scanner;

public class CalculadorPesoIdeal {

    public static void main(String[] args) {
        double a = 0, pi = 0;
        String s;

        Scanner in = new Scanner(System.in);
        System.out.print("Introduce tu altura en cm: ");
        a = in.nextDouble();
        in.nextLine();
        System.out.print("Introduce tu genero (f para femenino m para masculino): ");
        s = in.nextLine();

        if (s.equals("m")) {
            pi = a - 110;
            System.out.println(pi);
        } else {
            pi = a - 120;
            System.out.println(pi);
        }
    }
}



