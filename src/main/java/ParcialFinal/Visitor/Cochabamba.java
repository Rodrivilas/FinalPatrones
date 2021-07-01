package ParcialFinal.Visitor;

public class Cochabamba implements IDepartamentos{
    private String nombre;
    private int numProvincias, numHabitantes, dineroPorTurismo;
    private String clima;

    public Cochabamba(String nombre, int numProvincias, int numHabitantes, int dineroPorTurismo, String clima) {
        this.nombre = nombre;
        this.numProvincias = numProvincias;
        this.numHabitantes = numHabitantes;
        this.dineroPorTurismo = dineroPorTurismo;
        this.clima = clima;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumProvincias() {
        return numProvincias;
    }

    public void setNumProvincias(int numProvincias) {
        this.numProvincias = numProvincias;
    }

    public int getNumHabitantes() {
        return numHabitantes;
    }

    public void setNumHabitantes(int numHabitantes) {
        this.numHabitantes = numHabitantes;
    }

    public int getDineroPorTurismo() {
        return dineroPorTurismo;
    }

    public void setDineroPorTurismo(int dineroPorTurismo) {
        this.dineroPorTurismo = dineroPorTurismo;
    }

    public String getClima() {
        return clima;
    }

    public void setClima(String clima) {
        this.clima = clima;
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.gastarDinero(this);
    }
    public void showInfo(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Clima: "+clima);
        System.out.println("Dinero por turismo: "+dineroPorTurismo);
        System.out.println("Numero provincias: "+numProvincias);
        System.out.println("Numero habitantes: "+numHabitantes);
    }
}
