package asincronico2;

public class Ministro extends Politico {
    @Override
    public void procesarDocumento(int nivel) {
        //condición
        if(nivel==2){
            System.out.println("el documento es Secreto. Yo me encargo. Ministro");
        }else {
            getNextPolitico().procesarDocumento(nivel);
        }

        //else next!
    }
}
