package ParcialFinal.Adapter;

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
    public void cargar(int gas) {

    }

    @Override
    public void estadoDeElectricidad() {

    }
}
