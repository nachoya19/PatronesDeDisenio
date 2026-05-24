package FactoryMethod;

public class CreadorEmail extends CreadorNotificacion{
    protected Notificacion crearNotificacion(){
        return new NotificacionEmail();
    }
}
