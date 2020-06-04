package command;

public class Apagar implements ICommand {
    private Receiver receiver;

    public Apagar(Receiver receiver){
        this.receiver=receiver;
    }

    @Override
    public void execute(String usuario) {
        this.receiver.apagar(usuario);
    }
}
