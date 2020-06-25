package Composite;

public class CPUComponent extends Component {


    public CPUComponent(String titulo) {
        super(titulo);
    }

    @Override
    public int totalEstimacion() {
        System.out.println("Componente : ["+getTitulo()+"] Estimacion Total : [" + getPrecio()+"]");
        return this.getPrecio();
    }

    @Override
    public void add(Component component) {
        System.out.println("Not Applicable");
    }

    @Override
    public void remove(Component component) {
        System.out.println("Not Applicable");
    }

    @Override
    public void getChild(int position) {
        System.out.println("Not Applicable");
    }
}
