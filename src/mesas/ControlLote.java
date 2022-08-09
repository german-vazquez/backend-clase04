package mesas;

public class ControlLote extends Control {
    @Override
    public String controlesCalidad(Articulo articulo) {
        if (articulo.getLote() >= 1000 && articulo.getLote() <= 2000) {
            getNextControl().controlesCalidad(articulo);
            return "El lote es correcto!";
        } else {
            return "El lote está mal. Producto rechazado!";
        }
    }


}
