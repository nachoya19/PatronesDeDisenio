package Observer;

public class main {
    public static void main(String[] args) {
        CanalYoutube papusitoVEVO = new CanalYoutube();
        Suscriptor nacho = new Suscriptor("nachoyer19");
        Suscriptor pablo = new Suscriptor("pablitoCaraPito");
        Suscriptor soria = new Suscriptor("SORX_YT");
        papusitoVEVO.suscribir(nacho);
        papusitoVEVO.suscribir(pablo);
        papusitoVEVO.suscribir(soria);

        papusitoVEVO.subirVideo("Una asiatica me hace una paja (no creeras lo que pasa luego)");
    }

}
