package Observer;

public class Suscriptor implements Observador
{
   String nombre;
    public Suscriptor(String nommbre){
        this.nombre = nommbre;
    }

    public void actualizar(String tituloVideo){
        System.out.println("Hola " + nombre + "! Hay un nuevo vídeo: " + tituloVideo);
    }


}
