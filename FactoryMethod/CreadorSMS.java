package FactoryMethod;

public class CreadorSMS extends CreadorNotificacion{
    protected Notificacion crearNotificacion(){
        return new NotificacionSMS();
    }
}
