package JorgeLopez.Ejericios.Mediator;

import java.util.ArrayList;
import java.util.List;

public class Collegue1 extends Colleague {
    public List<String> dev;

    public Collegue1(Mediator mediator) {
        super(mediator);
        this.dev = new ArrayList<String>();
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
