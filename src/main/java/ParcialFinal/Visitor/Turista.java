package ParcialFinal.Visitor;

import java.util.Random;

public class Turista implements IVisitor{
    private String nombre;
    private int montoDinero;
    private String ci;

    public Turista(String nombre, int montoDinero, String ci) {
        this.nombre = nombre;
        this.montoDinero = montoDinero;
        this.ci = ci;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getMontoDinero() {
        return montoDinero;
    }

    public void setMontoDinero(int montoDinero) {
        this.montoDinero = montoDinero;
    }

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }
    public void showInfo(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Dinero: "+montoDinero);
        System.out.println("CI: "+ci);
    }
    @Override
    public void gastarDinero(LaPaz laPaz) {
        System.out.println("***********************");
        Random r=new Random();
        showInfo();
        int random=r.nextInt(50);
        setMontoDinero(montoDinero-(random));
        System.out.println("Dinero gastado: "+random);
        System.out.println("Dinero despues de la visita: "+montoDinero);
        laPaz.setDineroPorTurismo(laPaz.getDineroPorTurismo()+random);
        System.out.println();
        laPaz.showInfo();
    }

    @Override
    public void gastarDinero(SantaCruz santaCruz) {
        System.out.println("***********************");
        showInfo();
        setMontoDinero((int)(montoDinero-(santaCruz.getNumProvincias()*0.5)));
        System.out.println("Dinero gastado: "+(santaCruz.getNumProvincias()*0.5));
        System.out.println("Dinero despues de la visita: "+montoDinero);
        santaCruz.setDineroPorTurismo((int) (santaCruz.getDineroPorTurismo()+(santaCruz.getNumProvincias()*0.5)));
        System.out.println();
        santaCruz.showInfo();
    }

    @Override
    public void gastarDinero(Cochabamba cochabamba) {
        System.out.println("***********************");
        showInfo();

        setMontoDinero((int)(montoDinero-(cochabamba.getNumHabitantes()*0.1)));
        System.out.println("Dinero gastado: "+(cochabamba.getNumHabitantes()*0.1));
        System.out.println("Dinero despues de la visita: "+montoDinero);
        cochabamba.setDineroPorTurismo((int) (cochabamba.getDineroPorTurismo()+(cochabamba.getNumHabitantes()*0.1)));
        System.out.println();
        cochabamba.showInfo();
    }
}
