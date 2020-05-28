package JorgeLopez.Ejericios.Mediator;

import java.util.ArrayList;
import java.util.List;

public class Collegue2 extends Colleague{
    protected List<String> qa;

    public Collegue2(Mediator mediator) {
        super(mediator);
        this.qa = new ArrayList<String>();
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
