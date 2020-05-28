package JorgeLopez.Ejericios.Mediator;

import java.util.List;

public class Skype implements Mediator {
    private Collegue1 collegue1;
    private Collegue2 collegue2;
    private Collegue3 collegue3;

    @Override
    public void send(String msg, Colleague colleague) {
        if (colleague == collegue1) {
            for (int i = 0; i < collegue1.dev.size()-1; i++){
                collegue1.messageRecived(msg);
            }
        }else if (colleague == collegue2){
            for (int i = 0; i < collegue2.qa.size()-1; i++){
                collegue2.messageRecived(msg);
            }
        }else if(colleague == collegue3){
            for (int i = 0; i < collegue1.dev.size(); i++){
                collegue1.messageRecived(msg);
            }
            for (int i = 0; i < collegue2.qa.size(); i++){
                collegue2.messageRecived(msg);
            }
        }


    }

    public Collegue1 getCollegue1() {
        return collegue1;
    }

    public void setCollegue1(Collegue1 collegue1) {
        this.collegue1 = collegue1;
    }

    public Collegue2 getCollegue2() {
        return collegue2;
    }

    public void setCollegue2(Collegue2 collegue2) {
        this.collegue2 = collegue2;
    }
    public Collegue3 getCollegue3() {
        return collegue3;
    }

    public void setCollegue3(Collegue3 collegue3) {
        this.collegue3 = collegue3;
    }
}
