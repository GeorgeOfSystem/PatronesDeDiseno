package abstractFactory.State;

public class Superior implements IState {
    @Override
    public void handle() {
        System.out.println("el State es Superior");
    }
}
