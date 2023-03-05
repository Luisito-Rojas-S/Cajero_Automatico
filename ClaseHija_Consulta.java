
public class ClaseHija_Consulta extends ClasePadre_Abstracta {

  @Override
  public void Transacciones() {
    System.out.println("\n\33[32m-------------------------------------------------");
    System.out.println("Tu saldo actual es: " + getSaldo());
    System.out.println("-------------------------------------------------\n");

  }
}
