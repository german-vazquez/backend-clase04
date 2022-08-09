package mesas;

public class ControlPeso extends Control {
    @Override
    public String controlesCalidad(Articulo articulo) {
        if (articulo.getPeso() >= 1200 && articulo.getPeso() <= 1300) {
            getNextControl().controlesCalidad(articulo);
            return "El peso es correcto!";
        } else {
            return "El peso es incorrecto. Artículo rechazado!";
        }
    }


}
