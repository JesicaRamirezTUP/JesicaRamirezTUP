import java.util.Random;

public class CuentaCorriente {
    private double saldo;
    private final String nombreTitular;
    private final long numeroCuenta;

    public CuentaCorriente(String nombreTitular, double saldo) {
        this.nombreTitular = nombreTitular;
        this.saldo = saldo;
        this.numeroCuenta = new Random().nextLong();
    }

    public void ingreso(double monto) {
        System.out.println("==============================================");
        System.out.printf("saldo inicial: %s%n", saldo);
        System.out.printf("se ingresa el monto: %s%n", monto);
        this.saldo += monto;
        System.out.printf("saldo actualizado: %s%n", saldo);
        System.out.println("==============================================");
    }

    /*
     * retorna verdadero cuando la operacion fue exitosa
     * */
    public boolean egreso(double monto) {
        System.out.println("==============================================");
        System.out.printf("saldo inicial: %s%n", saldo);
        System.out.printf("se extrae el monto: %s%n", monto);
        if (getSaldo() < monto) {
            System.out.println("Saldo insuficiente!!!");
            System.out.println("==============================================");
            return false;
        } else {
            this.saldo -= monto;
            System.out.printf("saldo actualizado: %s%n", saldo);
            System.out.println("==============================================");
            return true;
        }
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void mostrarCuenta() {
        System.out.println("==============================================");
        System.out.printf("titular: %s%n", nombreTitular);
        System.out.printf("nro de cuenta: %s%n", numeroCuenta);
        System.out.printf("saldo: %s%n", saldo);
        System.out.println("==============================================");
    }

    public void transferir(CuentaCorriente cuenta, double monto) {
        boolean saldoSuficiente = this.egreso(monto);
        if (saldoSuficiente) {
            cuenta.ingreso(monto);
        }
    }
}
