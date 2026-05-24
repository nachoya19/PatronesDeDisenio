package Strategy;

import Strategy.ConcreteStrategies.EnvioEstandar;
import Strategy.ConcreteStrategies.EnvioExpres;
import Strategy.ConcreteStrategies.EnvioGratis;

public class tienda {
    public static void main(String[] args) {
        int eleccion = 1;
        EstrategiaEnvio estrategia = null;
        switch (eleccion) {
            case 1:
                estrategia = new EnvioGratis();
                break;
            case 2:
                estrategia = new EnvioEstandar();
                break;
            case 3:
                estrategia = new EnvioExpres();

                break;
            default:
                break;
        }
        Pedido pedido = new Pedido(50, estrategia);
        System.out.println(pedido.calcularTotal());
    }
}