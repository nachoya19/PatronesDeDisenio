package Strategy.ConcreteStrategies;

import Strategy.EstrategiaEnvio;

public class EnvioGratis implements EstrategiaEnvio{
    @Override
    public int calcularCoste(int importe){
        return importe;
    }  
}
