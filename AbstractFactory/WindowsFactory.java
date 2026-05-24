package AbstractFactory;

public class WindowsFactory implements GUIFactory{
    public BotonWindows crearBoton(){
        return new BotonWindows();
    }
    public CheckboxWindows crearCheckbox(){
        return new CheckboxWindows();
    }
}
