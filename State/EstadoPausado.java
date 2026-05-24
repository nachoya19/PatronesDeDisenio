package State;

public class EstadoPausado implements EstadoReproductor {
    @Override
    public void pulsarBoton(Reproductor contexto) {
        System.out.println("Reanudando la canción");
        contexto.setEstado(new EstadoReproduciendo());

    }
}
