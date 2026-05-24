package State;

public class EstadoReproduciendo implements EstadoReproductor {
    @Override
    public void pulsarBoton(Reproductor contexto) {
        System.out.println("Pausando la canción");
        contexto.setEstado(new EstadoDetenido());
        
    }  
}
