package Decorator;

public abstract class PizzaDecorator implements Pizza{
   Pizza pizza;
   
    public PizzaDecorator(Pizza piza){
        this.pizza = piza;
    }

    public String getDescripcion(){
        return pizza.getDescripcion();
    }
    public double getPrecio(){
        return pizza.getPrecio();
    }
}
