package FactoryMethod;

public abstract class CreadorNotificacion{

    protected abstract Notificacion crearNotificacion();

    public void ejecutarEnvio(){
        Notificacion noti = crearNotificacion();
        noti.enviarMensaje();
    }
}
