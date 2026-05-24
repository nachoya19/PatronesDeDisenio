package AbstractFactory;

public class MacFactory implements GUIFactory{
    public BotonMac crearBoton(){
        return new BotonMac();
    }
    public CheckboxMac crearCheckbox(){
        return new CheckboxMac();
    }
}
