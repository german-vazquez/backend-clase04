package asincronico2;

public class Presidente extends Politico{
    @Override
    public void procesarDocumento(int nivel) {
        //condición
        if(nivel==3){
            System.out.println("el documento es Muy Secreto. Yo me encargo. Presidente");
        }else {
            getNextPolitico().procesarDocumento(nivel);
        }
        //else next!
    }
}
