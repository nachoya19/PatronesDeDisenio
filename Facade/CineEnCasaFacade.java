package Facade;

public class CineEnCasaFacade {
    Televisor tele = new Televisor();
    EquipoSonido sonido = new EquipoSonido();
    Luces luces = new Luces();

    public void verPelicula(){
        tele.encender();
        tele.ponerEntradaHDMI();
        sonido.encender();
        sonido.ponerVolumen(80);
        luces.atenuar();
    }
}
