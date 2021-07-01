package ParcialFinal.Bridge;

public class Twitter implements IIntegracionRedSocial{
    @Override
    public void inscribirse(Estudiante estudiante) {
        System.out.println("Inscrito por twitter");
        estudiante.showInfo();
    }
}
