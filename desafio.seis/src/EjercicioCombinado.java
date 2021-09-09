public class EjercicioCombinado {


    public static void main(String[] args) {

        Fraccion numerador =  new Fraccion(6,5)
                .restar(new Fraccion(2,3)
                        .multiplicar(new Fraccion(7,2)))
                .sumar(new Fraccion(2,30));
        Fraccion denominador = new Fraccion(1,3).dividir(new Fraccion(5,1));
        System.out.println("El resultado es: "+numerador.dividir(denominador));
    }


}
