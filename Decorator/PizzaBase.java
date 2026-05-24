package Decorator;

public class PizzaBase implements Pizza{
    String descripcion = "Pizza base (tomate y queso)";
    Double precio = 8.0;

    public String getDescripcion(){
        return this.descripcion;
    }
    public double getPrecio(){
        return this.precio;
    }
}
