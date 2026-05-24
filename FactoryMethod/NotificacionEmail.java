package FactoryMethod;

public class NotificacionEmail implements Notificacion{
    public void enviarMensaje(){
        System.out.println("Enviando EMAIL");
    }
}
