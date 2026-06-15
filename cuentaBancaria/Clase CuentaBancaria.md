Clase CuentaBancaria 
//Atributos privados para proteger los datos
Privado Real: saldo
Privado Cadena: titular

// Método constructor para inicializar la cuenta 
Constructor (Cadena: nombreTitular, Real: SaldoInicial) 
   titular: nombreTitular
    Si SaldoInicial >= 0 Entonces 
       saldo = SaldoInicial
    Sino
       saldo = 0
       Imprimir "alerta: El saldo no puede ser negativo. Se asignó 0."
    FinSi   
FinConstructor

// Método para depositar dinero
Metodo depositar(Real: cantidad)
   Si cantidad > 0 Entonces 
        saldo = saldo + cantidad
        Imprimir "Depósito exitoso. Se han depositado: $", cantidad
    Sino
        Imprimir "Error: La cantidad a depositar debe ser mayor a cero."
    FinSi
FinMetodo

// Método para retirar dinero 
Metodo retirar(Real: cantidad)
    Si cantidad > 0 Entonces
       Si saldo >= cantidad Entonces
          saldo = saldo - cantidad
          Imprimir "Retiro exitoso. Se han retirado $", cantidad
       Sino
          Imprimir "Error: Fondos insuficientes. No se permite saldo negativo."
       FinSi 
FinMetodo

// Método para consultar el saldo actual
Metodo ConsultarSaldo()
    Imprimir "Titular de la cuenta: ", titular
    Imprimir "Saldo disponible: $", saldo
    Retornar saldo
  FinMetodo
FinClase    



