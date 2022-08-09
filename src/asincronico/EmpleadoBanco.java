package asincronico;

public abstract class EmpleadoBanco {

    private EmpleadoBanco sigEmpleadoBanco; // acá se declara un sigEmpleado pero recién en el main se declara quien es el sigEmpleado de cada clase.

    public abstract void procesarSolicitud(Integer monto);



    //getter y setter
    public EmpleadoBanco getSigEmpleadoBanco() {
        return sigEmpleadoBanco;
    }

    public void setSigEmpleadoBanco(EmpleadoBanco emp) {
        this.sigEmpleadoBanco = emp;
    }
}
