package abstractFactory.State;

public class Insuficiente implements IState {
    @Override
    public void handle() {
        System.out.println(" el State es Insuficiente");
    }
}
