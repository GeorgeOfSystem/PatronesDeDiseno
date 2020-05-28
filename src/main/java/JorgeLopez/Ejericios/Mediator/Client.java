package JorgeLopez.Ejericios.Mediator;

import mediator.basic.ConcreteColleague1;
import mediator.basic.ConcreteColleague2;
import mediator.basic.ConcreteMediator;

import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<String> dev;

        Skype skype = new Skype();

        Collegue1 c1 = new Collegue1(skype);
        c1.dev.add("Nicole1");
        c1.dev.add("Nicole2");
        c1.dev.add("Nicole3");
        c1.dev.add("Nicole4");

        Collegue2 c2 = new Collegue2(skype);
        c2.qa.add("Jorge1");
        c2.qa.add("Jorge2");
        c2.qa.add("Jorge3");

        Collegue3 c3 = new Collegue3(skype);
        c3.sm.add("DanielaArc.SM");

        skype.setCollegue1(c1);
        skype.setCollegue2(c2);
        skype.setCollegue3(c3);

        c1.send("este mensaje es para realizar una pregunta, que hora es?");
        c2.send("respuesta :  la hora es 8:27");
        c3.send("este mensaje es para realizar una pregunta, que hora es?");
        c2.send("respuesta :  la hora es 8:27");
        c1.send("respuesta :  la hora es 8:27");
        
    }


}
