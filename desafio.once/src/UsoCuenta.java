public class UsoCuenta {

    public static void main(String[] args) {
        CuentaCorriente cuenta1 = new CuentaCorriente("juan perez", 2500.0);
        cuenta1.mostrarCuenta();
        CuentaCorriente cuenta2 = new CuentaCorriente("cosme fulanito", 0.0);
        cuenta2.mostrarCuenta();
        cuenta1.transferir(cuenta2, 2500);
        cuenta1.mostrarCuenta();
        cuenta2.mostrarCuenta();
    }
}
