package JorgeLopez.Ejericios.Mediator;

import java.util.ArrayList;
import java.util.List;

public class Collegue3 extends Colleague{
    protected List<String> sm;

    public Collegue3(Mediator mediator) {
        super(mediator);
        this.sm = new ArrayList<String>();
    }

    @Override
    public void send(String msg) {
        mediator.send(msg,this);
    }

    @Override
    public void messageRecived(String msg) {
        System.out.println("Concrete Colleague1 > msg received  : "+msg);
    }
}
