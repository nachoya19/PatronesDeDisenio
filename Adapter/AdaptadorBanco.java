package Adapter;

public class AdaptadorBanco implements ProcesadorPago{
    SistemaAntiguoBanco sistema = new SistemaAntiguoBanco();

    public void pagar(double euros){
        sistema.realizarCobro((int)(euros * 100));
    }


}
