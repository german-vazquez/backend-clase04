package mesas;

public abstract class Control {

    private Control nextControl;

    public abstract String controlesCalidad(Articulo articulo);

    public Control getNextControl() {
        return nextControl;
    }

    public void setNextControl(Control nextControl) {
        this.nextControl = nextControl;
    }
}
