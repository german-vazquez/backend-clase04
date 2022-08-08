package presencial;

public class CompruebaMail {
    private final Manejador inicial;

    public CompruebaMail(){
        // creamos los eslabones
        inicial = new ManejadorGerencial();
        Manejador tecnico = new ManejadorTecnico();
        Manejador comercial = new ManejadorComercial();
        Manejador spam = new ManejadorSpam();

        // armamos la cadena
        inicial.setSiguienteManejador(tecnico);
        tecnico.setSiguienteManejador(comercial);
        comercial.setSiguienteManejador(spam);
    }
    public String comprobar(Mail mail){
        return inicial.comprobarMail(mail);
    }
}
