package ParcialFinal.Bridge;

public class Whatsapp implements IIntegracionRedSocial{
    @Override
    public void inscribirse(Estudiante estudiante) {
        System.out.println("Inscrito por whatsapp");
        estudiante.showInfo();
    }
}
