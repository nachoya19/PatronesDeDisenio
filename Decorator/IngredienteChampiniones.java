package Decorator;

public class IngredienteChampiniones extends PizzaDecorator {

    public IngredienteChampiniones(Pizza piza) {
        super(piza);
    }
    public String getDescripcion(){
        return pizza.getDescripcion() + " + Champiniones";
    }
    public double getPrecio(){
        return pizza.getPrecio() + 1;
    }
}
