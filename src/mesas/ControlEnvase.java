package mesas;

public class ControlEnvase extends Control {
    @Override
    public String controlesCalidad(Articulo articulo) {
        if (articulo.getEnvasado() == "sano") {
            getNextControl().controlesCalidad(articulo);
            return "El envase esta correcto!";
        } else {
           return "El envase no está sano. Artículo rechazado!";
        }
    }

}
