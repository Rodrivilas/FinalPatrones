package ParcialFinal.Visitor;

public class Cliente {
    public static void main (String[]args){
        Turista turista= new Turista("Juan Vargas",60000,"45612345");
        LaPaz l=new LaPaz("La Paz", 16,500000,250000,"Adverso");
        SantaCruz s=new SantaCruz("Santa Cruz", 32,700000,300000,"Muy Caliente");
        Cochabamba c=new Cochabamba("Cochabamba", 11,400000,120000,"Calido");

        turista.gastarDinero(l);
        turista.gastarDinero(s);
        turista.gastarDinero(c);
    }
}
