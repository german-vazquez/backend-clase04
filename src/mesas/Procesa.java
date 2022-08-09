package mesas;

public class Procesa {
    private CompruebaCalidad comprobador;
    private Articulo articulo;

    public Procesa(Articulo articulo) {
        this.comprobador = new CompruebaCalidad();
        this.articulo = articulo;
    }

    public CompruebaCalidad getComprobador() {
        return comprobador;
    }

    public void setComprobador(CompruebaCalidad comprobador) {
        this.comprobador = comprobador;
    }

    public Articulo getArticulo() {
        return articulo;
    }

    public void setArticulo(Articulo articulo) {
        this.articulo = articulo;
    }
}
