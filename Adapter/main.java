package Adapter;

public class main {
    public static void main(String[] args) {
        ProcesadorPago pago = new AdaptadorBanco();
        pago.pagar(25.50);
    }
}
