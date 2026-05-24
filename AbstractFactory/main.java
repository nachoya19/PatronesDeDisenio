package AbstractFactory;

public class main {
    public static void main(String[] args) {
        GUIFactory fabrica = new WindowsFactory();
        Boton boton = fabrica.crearBoton();
        Checkbox checkbox = fabrica.crearCheckbox();
        boton.pintar();
        checkbox.dibujar();
    }
}
