package EjerciciosObjetos.O06AlumnoProfeAsignatura;

public class Profesor {
    
    public void ponerNota(Alumno evaluado){
        double nota1, nota2, nota3;
        nota1 = Math.random()*10;
        nota2 = Math.random()*10;
        nota3 = Math.random()*10;
        evaluado.evaluarAsignaturas(nota1, nota2, nota3);
    }
    public void hacerMedia(Alumno evaluado){
        double asig1, asig2, asig3;
        asig1=evaluado.getAsig1().getNota();
        asig2=evaluado.getAsig2().getNota();
        asig3=evaluado.getAsig3().getNota();
        System.out.println("La media es "+((asig1+asig2+asig3)/3));
    }
}
