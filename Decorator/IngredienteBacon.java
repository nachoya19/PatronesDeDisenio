package Decorator;

public class IngredienteBacon extends PizzaDecorator {

    public IngredienteBacon(Pizza piza) {
        super(piza);
    }
    public String getDescripcion(){
        return pizza.getDescripcion() + " + Bacon";
    }
    public double getPrecio(){
        return pizza.getPrecio() + 1.5;
    }
     
}