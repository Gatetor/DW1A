import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int opcion = 1;
        Scanner teclado = new Scanner(System.in);
        Lista lista1 = new Lista(new ArrayList<Piloto>(), teclado);
        lista1.debugAddPiloto(999, "Franchesco", "Virgolini", "Italiano");
        lista1.debugAddCarrera(0, 4);
        lista1.debugAddPiloto(313, "Raul", "Seleccion", "ESPAÑA");

        while (opcion != 0) {
            System.out.println("Elije una opcion: " +
                    "\n  1.Añadir piloto" +
                    "\n  2.Añadir puntos " +
                    "\n  3.Añadir ultima puntuacion" +
                    "\n  4.Listado pilotos con puntuacion menor que 5" +
                    "\n  5.Numero de licencia de piloto con mas puntuacion" +
                    "\n  6.Nombre y apellidos ordenados alfabeticamente" +
                    "\n  0.salir");
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
                    lista1.imprimir(0);
                    break;
                // mayor media
                case 5:
                    lista1.buscarMayor();
                    break;
            }
            // sustituir por una pausa
            if (opcion != 0) {
                System.out.println();
                System.out.println("pulse para continuar");
                teclado.nextLine();
            }
        }
        System.out.println("Saliendo...");
        teclado.close();
    }
}
