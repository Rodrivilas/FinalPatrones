package ParcialFinal.Adapter;

import java.util.Random;

public class CuadraGasolina implements ICuadratracks{
private int gasolina;

    public CuadraGasolina(int gasolina) {
        this.gasolina = gasolina;
    }

    public int getGasolina() {
        return gasolina;
    }

    public void setGasolina(int gasolina) {
        this.gasolina = gasolina;
    }
    @Override
    public void llenarGasolina(int gas) {
        System.out.println("Cuadra gasolina ");
        gasolina=gasolina+gas;
        if(gasolina>50){
            System.out.println("Gasolina llena");
            setGasolina(50);
        }else {
            System.out.println("Gasolina llenada");
            System.out.println("Gasolina cargada:"+gasolina);
        }
    }

    @Override
    public void estadoCombustible() {
        System.out.println("Cuadra gasolina ");
        Random r= new Random();
        System.out.println("Estado del combustible: "+r.nextInt(50));
    }
}
