import java.util.ArrayList;
import java.util.Scanner;

public class Lista {

    private ArrayList<Piloto> listado;
    private Scanner teclado;

    // -------------minimos----------------
    public Lista(ArrayList<Piloto> listado, Scanner teclado) {
        this.listado = listado;
        this.teclado = teclado;
    }

    public ArrayList<Piloto> getListado() {
        return listado;
    }

    public void setListado(ArrayList<Piloto> listado) {
        this.listado = listado;
    }

    @Override
    public String toString() {
        imprimir(0);
        return "";
    }

    // ------------CASE 1--------------
    public void pedirPiloto() {
        // crear datos
        int licencia;
        String nombre, apellido, nacionalidad;

        // pedir y verificar datos
        System.out.println("Licencia del piloto:");
        licencia = nextNum();
        while (RepeatedLic(licencia)) {
            System.out.println("Licencia repetida, proporcione otra:");
            licencia = nextNum();
        }
        System.out.println("Nombre del piloto:");
        nombre = teclado.nextLine();
        System.out.println("Apellidos del piloto:");
        apellido = teclado.nextLine();
        System.out.println("Nacionalidad del piloto:");
        nacionalidad = teclado.nextLine();

        // añadir piloto
        System.out.println("Añadiendo piloto en la posicion " + listado.size());
        listado.add(new Piloto(licencia, nombre, apellido, nacionalidad, new ArrayList<Integer>()));
    }

    // -------------CASE 2---------
    public void addHistorial() {
        // crear datos
        int points, indexPiloto;

        // pedir y verificar datos
        indexPiloto = nextPiloto();
        if (indexPiloto == -1) {
            return;
        }
        // añadir carreras hasta que ponga -1
        System.out.println("Cuantos points quiere añadirle?");
        points = nextNum();
        while (0 < points) {
            System.out.println("Añadiendo carrera numero " + listado.get(indexPiloto).getpoints().size()
                    + " con "
                    + points + " points");
            listado.get(indexPiloto).getpoints().add(points);

            System.out.println("Cuantos points quiere añadirle? (negativos para salir)");
            points = nextNum();
        }
    }

    // -------------CASE 3---------
    public void addCarrera() {
        // crear datos
        int points, indexPiloto;

        // pedir y verificar datos
        indexPiloto = nextPiloto();
        if (indexPiloto == -1) {
            return;
        }
        System.out.println("Cuantos points quiere añadirle?");
        points = nextNum();

        // añadir carrera
        System.out.println("Añadiendo carrera numero " + listado.get(indexPiloto).getpoints().size()
                + " con " + points
                + " points");
        listado.get(indexPiloto).getpoints().add(points);
    }

    // -------------CASE 4---------
    public void imprimir(int minimo) {
        for (Piloto p : listado) {
            if (minimo <= p.averagepoints()) {
                System.out.println(p);
            }
        }
    }

    // -------------CASE 5---------
    public void buscarMayor() {
        double mayor = listado.get(0).averagepoints();
        for (int i = 1; i < listado.size(); i++) {
            if (mayor < listado.get(i).averagepoints()) {
                mayor = listado.get(i).averagepoints();
            }
        }
        // imprimir los que tengan dicho valor
        for (int i = 0; i < listado.size(); i++) {
            if (mayor == listado.get(i).averagepoints()) {
                System.out.println(listado.get(i));
            }
        }
    }

     // -------------CASE 6---------

     public void ordenaHihi() {
        for (int i = 0; i < listado.size(); i++) {
            
        }

     }


    // ------------helpers---------
    private int nextNum() {
        int numero;
        numero = Integer.parseInt(teclado.nextLine());
        return numero;
    }

    private char nextChar() {
        char caracter;
        caracter = teclado.nextLine().charAt(0);
        return caracter;
    }

    private boolean nextBool() {
        char opcion = nextChar();
        if (opcion == 'y' || opcion == 'Y') {
            return true;
        }
        return false;
    }

    private int nextPiloto() {
        int index;
        System.out.println("Index del piloto (" + 0 + "-" + (listado.size() - 1) + ")");
        index = nextNum();
        while (!(0 <= index && index < listado.size())) {
            System.out.println("Index no valido(" + 0 + "-" + (listado.size() - 1) + "), proporcione otro:");
            index = nextNum();
        }
        System.out.println(this.getListado().get(index));
        System.out.println("Este es el piloto que desea? [Y/N]");
        if (nextBool()) {
            return index;
        }
        return (-1);
    }

    private boolean RepeatedLic(int checked) {
        for (int i = 0; i < listado.size(); i++) {
            if (listado.get(i).getLicencia() == checked) {
                return true;
            }
        }
        return false;
    }

    // -----------debug--------------
    public void debugAddPiloto(int licencia, String nombre, String apellido, String nacionalidad) {
        listado.add(new Piloto(licencia, nombre, apellido, nacionalidad, new ArrayList<Integer>()));
    }

    public void debugAddCarrera(int index, int points) {
        listado.get(index).getpoints().add(points);
    }
}
