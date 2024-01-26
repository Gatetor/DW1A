import java.util.ArrayList;

public class Piloto {

    private int licencia;
    private String nombre;
    private String apellido;
    private String nacionalidad;
    private ArrayList<Integer> points;

    public Piloto(int licencia, String nombre, String apellido, String nacionalidad, ArrayList<Integer> points) {
        this.licencia = licencia;
        this.nombre = nombre;
        this.apellido = apellido;
        this.nacionalidad = nacionalidad;
        this.points = points;
    }

    public int getLicencia() {
        return licencia;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public ArrayList<Integer> getpoints() {
        return points;
    }

    public void setLicencia(int licencia) {
        this.licencia = licencia;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public void setpoints(ArrayList<Integer> points) {
        this.points = points;
    }

    @Override
    public String toString() {
        return "Piloto " + licencia +
                "\n  nombre:" + nombre + " " + apellido +
                "\n  nacionalidad:" + nacionalidad +
                "\n  average:" + averagepoints();
    }

    public double averagepoints() {
        double average = 0;
        for (int p : points) {
            average += p;
        }
        if (points.size() != 0) {
            return average / points.size();
        }
        return 0;
    }

}
