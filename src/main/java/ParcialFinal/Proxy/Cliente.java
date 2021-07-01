package ParcialFinal.Proxy;

public class Cliente {
    public static void main(String[] args) {

        Proxy proxy = new Proxy(new Servidor1(), new Servidor2());

        proxy.signin(new USuario(1,"user1", "123"));
        proxy.signin(new USuario(2,"user2", "456"));
        proxy.signin(new USuario(3,"user3", "789"));

        proxy.login(1, "123");
        proxy.login(2, "456");
        proxy.login(3, "789");

    }
}
