package ParcialFinal.Bridge;

import java.util.ArrayList;
import java.util.List;

public class SistemaUniversidad implements ISistemaInscripcion{
    private Estudiante estudiante;
    private IIntegracionRedSocial redSocial;
    private String nombre, requisitos;
    private int capacidad;
    private List<Estudiante> estudiantes=new ArrayList<Estudiante>();

    public SistemaUniversidad(Estudiante estudiante, IIntegracionRedSocial redSocial, String nombre, String requisitos, int capacidad) {
        this.estudiante = estudiante;
        this.redSocial = redSocial;
        this.nombre = nombre;
        this.requisitos = requisitos;
        this.capacidad = capacidad;
    }

    @Override
    public void inscribir() {
        System.out.println("Inscripcion universidad");
        redSocial.inscribirse(estudiante);
        estudiantes.add(estudiante);
        showInfo();
    }

    public void showInfo(){
        System.out.println("Universidad: "+nombre);
        System.out.println("Requisitos: "+requisitos);
        System.out.println("Capacidad: "+capacidad);
    }
}
