package asincronico2;

public abstract class Politico {
    private Politico nextPolitico;

    public abstract void procesarDocumento(int nivel);

    public Politico getNextPolitico() {
        return nextPolitico;
    }

    public void setNextPolitico(Politico nextPolitico) {
        this.nextPolitico = nextPolitico;
    }
}
