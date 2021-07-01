package ParcialFinal.Bridge;

public class sistemaColegio implements ISistemaInscripcion{
    private Estudiante estudiante;
    private IIntegracionRedSocial redSocial;

    public sistemaColegio(Estudiante estudiante, IIntegracionRedSocial redSocial) {
        this.estudiante = estudiante;
        this.redSocial = redSocial;
    }

    @Override
    public void inscribir() {

    }
}
