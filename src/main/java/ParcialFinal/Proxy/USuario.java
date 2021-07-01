package ParcialFinal.Proxy;

public class USuario {
    private int numUsuario;
    private String nombre;
    private String contrasena;

    public USuario(int numUsuario, String nombre, String contrasena){
        this.numUsuario=numUsuario;
        this.nombre=nombre;
        this.contrasena = contrasena;
    }

    public int getNumUsuario() {
        return numUsuario;
    }

    public void setNumUsuario(int numUsuario) {
        this.numUsuario = numUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public void showInfo(){
        System.out.println("Info del usuario: ");
        System.out.println("Numero de usuario: "+ numUsuario);
        System.out.println("Nombre del usuario: "+ nombre);
        System.out.println("Contraseña: "+ contrasena);
    }
}
