public class main {


    public static void main(String[] args) {

        CuentaBancaria cuenta = new CuentaBancaria("Ednna Mendieta", 500000.0);

        cuenta.consultarSaldo();
        cuenta.depositar(200000.0);
        cuenta.retirar(100000.0);

    }
}
