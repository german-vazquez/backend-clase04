package asincronico;

public class EjecutivoCuenta extends EmpleadoBanco{

    @Override
    public void procesarSolicitud(Integer monto) {
        //condición
        if(monto<60000){
            System.out.println("yo me encargo. Ejecutivo de cuenta");
        } else if (getSigEmpleadoBanco()!= null) {
            getSigEmpleadoBanco().procesarSolicitud(monto);
        }
    }
}
