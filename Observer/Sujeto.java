package Observer;

public interface Sujeto {
    public void suscribir(Observador o);
    public void notificar(String tituloVideo);
}
