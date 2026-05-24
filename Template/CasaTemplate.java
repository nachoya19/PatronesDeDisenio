package Template;

public abstract class CasaTemplate {
    public final void construir(){
        construirCimentos();
        contruirParedes();
        instalarVentanas();
    }

    public void construirCimentos(){
        System.out.println("Cimientos de cemento");
    }

    public abstract void contruirParedes();

    public abstract void instalarVentanas();
}
