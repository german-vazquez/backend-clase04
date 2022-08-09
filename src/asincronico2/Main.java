package asincronico2;

public class Main {
    public static void main(String[] args) {
        Politico diputado = new Diputado();
        Politico ministro = new Ministro();
        Politico presidente = new Presidente();
        diputado.setNextPolitico(ministro);
        ministro.setNextPolitico(presidente);
        diputado.procesarDocumento(1);
    }
}
