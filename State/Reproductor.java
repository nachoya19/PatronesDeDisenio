package State;

public class Reproductor {

    EstadoReproductor estado = new EstadoDetenido();

    public void pulsarBoton(){
        estado.pulsarBoton(this);
    }

    public void setEstado(EstadoReproductor estado){
        this.estado = estado;
    }

}
