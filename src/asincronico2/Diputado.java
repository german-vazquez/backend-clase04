package asincronico2;

public class Diputado extends Politico{

    @Override
    public void procesarDocumento(int nivel) {
        //condición
        if(nivel==1){
            System.out.println("El documento es Reservado. Yo me encargo. Diputado");
        } else {
            getNextPolitico().procesarDocumento(nivel);
        }
        //else next!
    }
}
