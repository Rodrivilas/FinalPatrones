package ParcialFinal.Bridge;

public class Cliente {
    public static void main(String[] args) {
        SistemaColegio sistemaColegio=new SistemaColegio(new Estudiante("Rodrigo",123),new Facebook(),"SantaMAria","Ser feliz",64);
        sistemaColegio.inscribir();

        SistemaEscuela sistemaEscuela=new SistemaEscuela(new Estudiante("Raul",456),new Whatsapp(),"SantaAna","Ser inteligente",40);
        sistemaEscuela.inscribir();

        SistemaUniversidad sistemaUniversidad=new SistemaUniversidad(new Estudiante("Juan",123),new Twitter(),"UPB","Ser estudioso",250);
        sistemaUniversidad.inscribir();
    }
}
