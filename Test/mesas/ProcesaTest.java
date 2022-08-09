package mesas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProcesaTest {
    @Test
    public void analisisDeCalidad(){
        Articulo articulo = new Articulo("cosa", 1100, 1250, "sano");
        Procesa procesa = new Procesa(articulo);
        String espectativa ="";
        String realidad = procesa.getComprobador().analizar(procesa.getArticulo());
        assertEquals(espectativa,realidad);

    }

}