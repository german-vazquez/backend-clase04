package mesas;

public class CompruebaCalidad {

    private final Control inicial;

    public CompruebaCalidad(Articulo articulo) {

        // creamos eslabones
        Control peso = new ControlPeso();
        inicial = new ControlLote();
        Control envase = new ControlEnvase();

        // armamos cadena
        inicial.setNextControl(peso);
        peso.setNextControl(envase);
    }

    public String analizar(Articulo articulo) {
        return inicial.controlesCalidad(articulo);
    }


}
