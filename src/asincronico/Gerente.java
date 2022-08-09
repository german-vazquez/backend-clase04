package asincronico;

public class Gerente extends EmpleadoBanco{

    @Override
    public void procesarSolicitud(Integer monto) {
        //condición
        if (monto>=60000 && monto <= 200000){
            System.out.println("yo me encargo. Gerente");
        } else if (getSigEmpleadoBanco()!=null) {
            getSigEmpleadoBanco().procesarSolicitud(monto);
        }
    }
}
