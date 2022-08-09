package asincronico;

public class Director extends EmpleadoBanco {


    @Override
    public void procesarSolicitud(Integer monto) {
        //condición
        if (monto > 200000) {
            System.out.println("yo me encargo. Director");
        } else if (getSigEmpleadoBanco() != null) {
            getSigEmpleadoBanco().procesarSolicitud(monto);
        }
    }
}
