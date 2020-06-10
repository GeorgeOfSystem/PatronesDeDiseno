package abstractFactory.State;

public class Dispensadora {
    private IState state;
    private int precioProduct = 100;
    private  int dineroIntroducido;

    public Dispensadora(){
    }

    public IState getState() {
        return state;
    }

    public void setState(IState state) {
        this.state = state;
    }

    public void request(){
        state.handle();
    }

    public int getPrecioProduct() {
        return precioProduct;
    }

    public int getDineroIntroducido() {
        return dineroIntroducido;
    }

    public void setDineroIntroducido(int dineroIntroducido) {
        this.dineroIntroducido = dineroIntroducido;
    }
}
