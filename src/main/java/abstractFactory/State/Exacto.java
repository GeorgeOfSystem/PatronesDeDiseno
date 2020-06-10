package abstractFactory.State;

public class Exacto implements IState {
    @Override
    public void handle() {
        System.out.println("el State es Exacto");
    }
}
