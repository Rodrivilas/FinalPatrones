package ParcialFinal.Visitor;

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
        System.out.println("Dinero despues de la visita: "+montoDinero);
    }

    @Override
    public void gastarDinero(SantaCruz santaCruz) {
        setMontoDinero((int)(montoDinero-(santaCruz.getNumProvincias()*0.5)));
    }

    @Override
    public void gastarDinero(Cochabamba cochabamba) {
        setMontoDinero((int)(montoDinero-(cochabamba.getNumHabitantes()*0.1)));
    }
}
