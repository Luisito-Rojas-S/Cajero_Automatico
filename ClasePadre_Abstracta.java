import java.util.Scanner;

public abstract class ClasePadre_Abstracta {

  protected int transacciones, retiro, deposito;
  private static int saldo;
  Scanner entrada = new Scanner(System.in);

  public void Operaciones() {
    int bandera = 0;
    int seleccion = 0;
    do {
      do {

        System.out.println("\n\t\t\33[37m***** MENU *****");
        System.out.println("    1.- Consulta de saldo");
        System.out.println("    2.- Retiro de efectivo");
        System.out.println("    3.- Deposito de efectivo");
        System.out.println("    4.- Salir");

        System.out.print("\33[37mPor favor seleccione una opcion: ");
        seleccion = entrada.nextInt();

        if (seleccion >= 1 && seleccion <= 4) {
          bandera = 1;
        } else {
          System.out.println("\n\33[31m-----------------------------------------------------------------");
          System.out.println("Opcion no valida.Por favor intente de nuevo");
          System.out.println("-----------------------------------------------------------------\n");
        }

      } while (bandera == 0);

      if (seleccion == 1) {
        ClasePadre_Abstracta mensajero = new ClaseHija_Consulta();
        mensajero.Transacciones();
      } else if (seleccion == 2) {
        ClasePadre_Abstracta mensajero = new ClaseHija_Retiro();
        mensajero.Transacciones();
      } else if (seleccion == 3) {
        ClasePadre_Abstracta mensajero = new ClaseHija_Deposito();
        mensajero.Transacciones();
      } else if (seleccion == 4) {
        System.out.println("\n\33[32m---------------------------------");
        System.out.println("Gracias vuelva pronto");
        System.out.println("---------------------------------\n");
        bandera = 2;
      }

    } while (bandera != 2);

  }

  // metodo para solicitar cantidad de retiro
  public void Retiro() {
    retiro = entrada.nextInt();
  }

  // metodo para solicitar cantidad de deposito
  public void Deposito() {
    deposito = entrada.nextInt();
  }

  // etodo abstracto
  public abstract void Transacciones();

  // metodos setter y getter
  public int getSaldo() {
    return saldo;
  }

  public void setSaldo(int saldo) {
    this.saldo = saldo;
  }

}
