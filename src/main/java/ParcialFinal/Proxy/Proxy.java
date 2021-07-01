package ParcialFinal.Proxy;

import java.util.ArrayList;
import java.util.List;

public class Proxy implements  ICluster{
    private Servidor1 servidor1;
    private Servidor2 servidor2;
    private List<USuario> USuarios =new ArrayList<USuario>();

    public Proxy(Servidor1 servidor1, Servidor2 servidor2) {
        this.servidor1 = servidor1;
        this.servidor2 = servidor2;
    }
    public void signin(USuario usuario){
        USuarios.add(usuario);
    }

    @Override
    public void login(int usuarioNum, String contrasena) {
        for(USuario usuario : USuarios) {
            if(usuario.getContrasena().equals(contrasena) && usuario.getNumUsuario() == usuarioNum) {
                if(usuario.getNumUsuario() == 0) {
                    servidor1.login(usuarioNum, contrasena);
                    usuario.showInfo();
                }else {
                    servidor2.login(usuarioNum, contrasena);
                    usuario.showInfo();
                }
            }else if(!usuario.getContrasena().equals(contrasena) && usuario.getNumUsuario() == usuarioNum){
                System.out.println("Error al iniciar sesión");
            }
        }
    }
}
