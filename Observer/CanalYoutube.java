package Observer;

import java.util.ArrayList;
import java.util.List;

import javax.management.ObjectName;

public class CanalYoutube implements Sujeto{
    List <Observador> subs = new ArrayList();

    public void suscribir(Observador o){
        subs.add(o);
    }
    public void notificar(String tituloVideo){
        for (Observador observador : subs) {
            observador.actualizar(tituloVideo);
        }
    }
    public void subirVideo(String titulo){
        notificar(titulo);
    }
}
