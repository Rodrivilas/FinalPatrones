package ParcialFinal.Proxy;

public class Servidor1 implements ICluster{

    @Override
    public void login(int usuarioNum, String contrasena) {
        System.out.println("Server1");
        System.out.println("Numero de usuario: "+ usuarioNum);
        System.out.println("Credencial: "+contrasena);
        System.out.println("Credencial correcta");
        System.out.println();
        System.out.println("Iniciando sesión...");
    }
}
