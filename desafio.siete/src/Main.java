import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//Evaluando la funcion sin en Pi debio haber sido
        System.out.println(Math.sin(90));
//Al no dar cero significa que esta en Radianes la funcion SENO.
        //Usando el metodo toRandians para convertir el angulo a radianes.
        System.out.println(Math.sin(Math.toRadians(90)));
        //usando la constante PI
        System.out.println(Math.sin(Math.PI / 2));
        //Evaluando la funcion Coseno
        System.out.println(Math.cos(Math.toRadians(180)));
        //usando la constante PI
        System.out.println(Math.cos(Math.PI));
        //Evaluando la tangente
        System.out.println(Math.tan(Math.PI / 4) + " deberia ser igual a " + Math.sin(Math.PI / 4) / Math.cos(Math.PI / 4));
        //Evaluando la arcoTangente -> inversa de la tangente nos da el angulo pasado como parametro EL NRO de euler.
        System.out.println(Math.atan(Math.tan(Math.E)));
        //Evaluando la funcion logaritmo del nro de Euler
        System.out.println(Math.log(Math.E));
        //Evaluando la funcion logaritmo del nro de un nro negativo- NAN not a number
        System.out.println(Math.log(-2));
    }
}