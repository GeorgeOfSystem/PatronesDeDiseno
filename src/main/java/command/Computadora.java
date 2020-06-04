package command;

import java.util.ArrayList;
import java.util.List;

public class Computadora {

    private List<ICommand> commandList = new ArrayList<>();
    private String usuario;

    public Computadora(String usuario){
        this.usuario=usuario;
    }

    public void setCommand(ICommand command){
        this.commandList.add(command);
    }

    public void runCommand(){
        for (ICommand command:this.commandList) {
            command.execute(usuario);
        }
        commandList.clear();
    }
}
