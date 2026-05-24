package State;

public class EstadoDetenido implements EstadoReproductor {
    @Override
    public void pulsarBoton(Reproductor contexto) {
        System.out.println("Empezando a reproducir la canción");
        contexto.setEstado(new EstadoReproduciendo());
    }
}
