package ParcialFinal.Bridge;

import java.util.ArrayList;
import java.util.List;

public class SistemaColegio implements ISistemaInscripcion{
    private Estudiante estudiante;
    private IIntegracionRedSocial redSocial;
    private String nombre, requisitos;
    private int capacidad;
    private List<Estudiante> estudiantes=new ArrayList<Estudiante>();

    public SistemaColegio(Estudiante estudiante, IIntegracionRedSocial redSocial, String nombre, String requisitos, int capacidad) {
        this.estudiante = estudiante;
        this.redSocial = redSocial;
        this.nombre = nombre;
        this.requisitos = requisitos;
        this.capacidad = capacidad;
    }

    @Override
    public void inscribir() {
        System.out.println("Inscripcion colegio");
        redSocial.inscribirse(estudiante);
        estudiantes.add(estudiante);
        showInfo();
    }

    public void showInfo(){
        System.out.println("Colegio: "+nombre);
        System.out.println("Requisitos: "+requisitos);
        System.out.println("Capacidad: "+capacidad);
    }
}
