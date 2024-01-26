import java.util.ArrayList;
import java.util.Scanner;

//FIXME: Fix this shit
//TODO: Stop being stupid
public class Main {
    public static void main(String[] args) {

        int opcion = 1;
        Scanner teclado = new Scanner(System.in);
        Lista lista1 = new Lista(new ArrayList<Piloto>(), teclado);
        lista1.debugAddPiloto(123, "YES", "Your", "MOM");
        lista1.debugAddCarrera(0, 5);
        lista1.debugAddPiloto(456, "Not", "Your", "DAD");

        while (opcion != 0) {
            System.out.println("Choose wisely: " +
                    "\n  1. Add pilot" +
                    "\n  2. Add points " +
                    "\n  3. Add points in last pos" +
                    "\n  4. Minors de 5" +
                    "\n  5. License with max pwoints >:3" +
                    "\n  6. Awwfwabetwical owwder" +
                    "\n  0. Noppers");

            opcion = teclado.nextLine().charAt(0) - 48;
            switch (opcion) {
                // añadir un piloto
                case 1:
                    lista1.pedirPiloto();
                    break;
                // añadir carreras
                case 2:
                    lista1.addHistorial();
                    break;
                // añadir ultima carrera
                case 3:
                    lista1.addCarrera();
                    break;
                // listado
                case 4:
                    lista1.imprimir(5);
                    break;
                // mayor average
                case 5:
                    lista1.buscarMayor();
                    break;
            }
            // sustituir por una pausa
            if (opcion != 0) {
                System.out.println();
                System.out.println("Enter to continue");
                teclado.nextLine();
            }
        }
        System.out.println("Bwayyyy >w<");
        teclado.close();
    }
}
