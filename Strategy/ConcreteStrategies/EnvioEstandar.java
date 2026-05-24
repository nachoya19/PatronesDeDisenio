package Strategy.ConcreteStrategies;

import Strategy.EstrategiaEnvio;

public class EnvioEstandar implements EstrategiaEnvio{
    @Override
    public int calcularCoste(int importe){
        return importe + 5;
    }  
    
}
