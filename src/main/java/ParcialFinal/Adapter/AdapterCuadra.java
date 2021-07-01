package ParcialFinal.Adapter;

import java.util.Random;

public class AdapterCuadra implements ICuadratracksElectricos{
    private CuadraGasolina cuadraGasolina;
    private CuadraDiesel cuadraDiesel;
    private CuadraGasEspecial cuadraGasEspecial;

    public AdapterCuadra(CuadraGasolina cuadraGasolina, CuadraDiesel cuadraDiesel, CuadraGasEspecial cuadraGasEspecial) {
        this.cuadraGasolina = cuadraGasolina;
        this.cuadraDiesel = cuadraDiesel;
        this.cuadraGasEspecial = cuadraGasEspecial;
    }


    @Override
    public void cargar(int carga) {
        System.out.println("*Cuadra gasolina cargar electricidad");
        cuadraGasolina.setGasolina(cuadraGasolina.getGasolina()+carga);
        if(cuadraGasolina.getGasolina()>20){
            System.out.println("Carga completa");
        }else {
            System.out.println("Carga llenada");
            System.out.println("Total cargada:"+carga);
        }

        System.out.println();
        System.out.println("*Cuadra diesel cargar electricidad");
        cuadraDiesel.setGasolina(cuadraDiesel.getGasolina()+carga);
        if(cuadraDiesel.getGasolina()>20){
            System.out.println("Carga completa");
        }else {
            System.out.println("Carga llenada");
            System.out.println("Total cargada:"+carga);
        }

        System.out.println();
        System.out.println("*Cuadra gasolinaEspecial cargar electricidad");
        cuadraGasEspecial.setGasolina(cuadraGasEspecial.getGasolina()+carga);
        if(cuadraGasEspecial.getGasolina()>20){
            System.out.println("Carga completa");
        }else {
            System.out.println("Carga llenada");
            System.out.println("Total cargada:"+carga);
        }
    }

    @Override
    public void estadoDeElectricidad() {
        Random r= new Random();
        System.out.println();
        System.out.println("Estado de electricidad cuadra gasolina adaptado: "+r.nextInt(10));
        System.out.println();
        System.out.println("Estado de electricidad cuadra diesel adaptado: "+r.nextInt(10));
        System.out.println();
        System.out.println("Estado de electricidad cuadra gasolina especial adaptado: "+r.nextInt(10));
        System.out.println();
    }
}
