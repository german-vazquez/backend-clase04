package mesas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProcesaTest {
    @Test
    public void analisisDeCalidad(){
        Articulo articulo = new Articulo("cosa", 110, 1250, "sano");
        Procesa procesa = new Procesa(articulo);
        String espectativa ="anoche";

    }

}