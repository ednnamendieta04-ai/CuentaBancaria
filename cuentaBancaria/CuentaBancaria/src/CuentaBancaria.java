import java.util.regex.MatchResult;
//Representa una cuenta bancaria básica con operaciones de deposito, retiro y consulta de saldo.//

public class CuentaBancaria {

  //Atributos//
//Nombre de la persona dueña de la cuenta.//
  private String titular;
  //Cantidad de dinero disponible.//
  private double saldo;

  //Se crea una cuenta bancaria con un titular y un saldo inicial.//

    public CuentaBancaria(String titular, double saldoInicial) {
       if (saldoInicial < 0) {
           throw new IllegalArgumentException("El saldo no puede ser negativo.");
       }

       this.titular = titular;
       this.saldo = saldoInicial;

    }
//Se crea la acción de depositar, en la que incrementará el saldo de la cuenta.//

  public void depositar(double cantidad) {
        //Se pone la condición que el monto a depositar debe ser meyor a cero, de lo contrario
      // saldra una alerta.//
        if (cantidad <= 0) {
            System.out.println("Error: el monto debe ser mayor a cero.");
            return;
        }

        this.saldo = this.saldo + cantidad;
      System.out.println("Deposito exitoso. Nuevo saldo: " + this.saldo);
  }

  //Disminuye el saldo de la cuenta si hay fondos suficientes y la cantidad es valida.

public boolean retirar(double cantidad) {
        //Se pone la condición que el monto a retirar debe ser mayor a cero.
        if (cantidad <= 0) {
            System.out.println("Error: el monto debe ser mayor a cero.");
            return false;
        }
        //Se pone la condición que el saldo no quede en negativo
        if (cantidad > this.saldo) {
            System.out.println("Fondos insuficientes. Saldo actual: " + this.saldo);
            return false;
        }
        this.saldo = this.saldo - cantidad;
    System.out.println("Retiro exitoso. Nuevo saldo: " + this.saldo);
    return true;
}
//Muestra la información de la cuenta y devuelve al saldo actual

public double consultarSaldo() {
    System.out.println("Titular: " + this.titular);
    System.out.println("Saldo: " + this.saldo);
    return this.saldo;
}
//Se obtiene el nombre del titular.
public String getTitular() {
        return this.titular;
}
//Se obtiene el saldo de la cuenta.
public double getSaldo() {
        return this.saldo;
  }
}
