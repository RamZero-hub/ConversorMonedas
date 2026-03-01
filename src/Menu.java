import java.util.Scanner;

public class Menu {

    public void iniciar(){
        //Sirve para dar la bienvenida al usuario
        System.out.println("--------------------------------------------------");
        System.out.println("|                                                |");
        System.out.println("|     ¡Bienvenido al Conversor de Moneda!        |");
        System.out.println("|                                                |");
        System.out.println("|  Realiza conversiones de manera rápida         |");
        System.out.println("|  y con tasas actualizadas                      |");
        System.out.println("|                                                |");
//        System.out.println("--------------------------------------------------");
    }

    public void mostrarMenu(){
        //imprime el menu
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;

        while (opcion != 3) {
            System.out.println("-----------------------------------------------------------------");
            System.out.println(" ==================== CONVERSOR DE MONEDAS ====================  ");
            System.out.println("-----------------------------------------------------------------");
            System.out.println("1.- (USD) Dolar                  --- (COP) Pesos Colombianos    |");
            System.out.println("2.- (USD) Dolar                  --- (EUR) Euros                |");
            System.out.println("3.- (EUR) Euros                  --- (USD) Dolar                |");
            System.out.println("4.- (EUR) Euros                  --- (COP) Pesos Colombianos    |");
            System.out.println("5.- (COP) Pesos Colombianos      --- (USD) Dolar                |");
            System.out.println("6.- (COP) Pesos Colombianos      --- (EUR) Euros                |");
            System.out.println("");
            System.out.println("7.- Salir");
            System.out.println("");
            System.out.println("Seleccione una opción: ");
            System.out.println("-----------------------------------------------------------------");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Producto creado");
                    break;
                case 2:
                    System.out.println("Listado de productos");
                    break;
                case 3:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción inválida");
            }
            System.out.println();
        }
        scanner.close();
    }
}
