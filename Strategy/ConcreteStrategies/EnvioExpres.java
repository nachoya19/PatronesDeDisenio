package Strategy.ConcreteStrategies;

import Strategy.EstrategiaEnvio;

public class EnvioExpres implements EstrategiaEnvio{
    @Override
    public int calcularCoste(int importe){
        return importe + 10;
    }  
    
}
