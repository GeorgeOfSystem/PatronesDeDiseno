package command;

public class CerrarSesión implements ICommand{
    private Receiver receiver;

    public CerrarSesión(Receiver receiver){
        this.receiver=receiver;
    }

    @Override
    public void execute() {
        this.receiver.cerrarSesion();
    }
}
