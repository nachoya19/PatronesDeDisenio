package FactoryMethod;

public class main {
    public static void main(String[] args) {
        CreadorNotificacion creador = new CreadorSMS();
        creador.ejecutarEnvio();
    }
}
