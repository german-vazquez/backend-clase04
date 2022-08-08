package presencial;

public abstract class Manejador {

    private Manejador siguienteManejador;
    public abstract String comprobarMail (Mail mail);

    public Manejador getSiguienteManejador() {
        return siguienteManejador;
    }

    public void setSiguienteManejador(Manejador siguienteManejador) {
        this.siguienteManejador = siguienteManejador;
    }
}
