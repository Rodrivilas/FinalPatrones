package ParcialFinal.Adapter;

public class Cliente {
    public static void main (String[]args){
        CuadraGasolina c=new CuadraGasolina(10);
        c.llenarGasolina(30);
        c.estadoCombustible();

        CuadraDiesel c1=new CuadraDiesel(30);

        CuadraGasEspecial c2=new CuadraGasEspecial(10);

        AdapterCuadra adapter=new AdapterCuadra(c,c1,c2);

    }
}
