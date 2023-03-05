public class ClaseHija_Deposito extends ClasePadre_Abstracta {

  public void Transacciones() {
    System.out.print("Cuanto dinero deseas depositar?: ");
    Deposito();
    transacciones = getSaldo();
    setSaldo(transacciones + deposito);

    System.out.println("\n\33[32m-------------------------------------------------");
    System.out.println("Depositaste " + deposito);
    System.out.println("Tu saldo actua es: " + getSaldo());
    System.out.println("-------------------------------------------------\n");

  }

}
