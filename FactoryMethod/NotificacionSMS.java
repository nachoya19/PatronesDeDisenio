package FactoryMethod;

public class NotificacionSMS implements Notificacion{
        public void enviarMensaje(){
            System.out.println("Enviando SMS");
        }
}
