package ParcialFinal.Bridge;

public class Facebook implements IIntegracionRedSocial{
    @Override
    public void inscribirse(Estudiante estudiante) {
        System.out.println("Inscrito por facebook");
        estudiante.showInfo();
    }
}
