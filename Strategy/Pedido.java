package Strategy;

public class Pedido {
    int importe;
    EstrategiaEnvio estrategia;

    public Pedido(int importe, EstrategiaEnvio estrategia){
        this.importe = importe;
        this.estrategia = estrategia;
    }

    public int calcularTotal() {
        return estrategia.calcularCoste(importe);
    }
}
