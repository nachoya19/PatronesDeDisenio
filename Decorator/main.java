package Decorator;

public class main {
    public static void main(String[] args) {
        Pizza pizza = new PizzaBase();
        pizza = new IngredienteBacon(pizza);
        pizza = new IngredienteChampiniones(pizza);
        System.out.println("Pedido: " + pizza.getDescripcion());
        System.out.println("Total a pagar: " + pizza.getPrecio() + "€");

    }
}
