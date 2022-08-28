package proyecto;

public class Proyecto {
    public static void main(String[] args) {

        //CREAR INSTANCIA DE LA CLASE Empresa
        Empresa empresa1=new Empresa(1234567890,"AmbienSoft",
                             3140000,"CLL 8 # 3-56");

        //LEER Y MODIFICAR EL NOMBRE DE LA EMPRESA
        System.out.println(empresa1.getNombreEmpresa());
        empresa1.setNombreEmpresa("AmbienSoft LTDA.");
        System.out.println(empresa1.getNombreEmpresa());

        System.out.println("----------------------------------");

        //LEER Y MODIFICAR LA DIRECCION DE LA EMPRESA
        System.out.println(empresa1.getDireccion());
        empresa1.setDireccion("KRA 20 #15-47");
        System.out.println(empresa1.getDireccion());

        System.out.println("----------------------------------");

        //LEER Y MODIFICAR EL TELEFONO DE LA EMPRESA
        System.out.println(empresa1.getTelefono());
        empresa1.setTelefono(7860000);
        System.out.println(empresa1.getTelefono());

        System.out.println("----------------------------------");

        //LEER Y MODIFICAR EL NIT DE LA EMPRESA
        System.out.println(empresa1.getNit());
        empresa1.setNit(987654321);
        System.out.println(empresa1.getNit());

        System.out.println("----------------------------------");

        Empresa empresa2=new Empresa(546577564,"ClearnSoft",
                3184444,"CLL 5 # 12-06");

        //CREAR INSTANCIA DE LA CLASE Empleado
        Empleado empleado1=new Empleado("Juan Perez","juanperez123@gmail.com",
                                         Tipo.operativo,empresa1);

        //LEER Y MODIFICAR EL NOMBRE DE UN EMPLEADO
        System.out.println(empleado1.getNombreEmpleado());
        empleado1.setNombreEmpleado("Juan Perez Lopez");
        System.out.println(empleado1.getNombreEmpleado());

        System.out.println("----------------------------------");

        //LEER Y MODIFICAR EL CORREO DE UN EMPLEADO
        System.out.println(empleado1.getCorreo());
        empleado1.setCorreo("juanperez_123@hotmail.com");
        System.out.println(empleado1.getCorreo());

        System.out.println("----------------------------------");

        //LEER Y MODIFICAR LA EMPRESA A LA CUAL PERTENECE EL EMPLEADO
        System.out.println(empleado1.getEmpresa().getNombreEmpresa());
        empleado1.setEmpresa(empresa2);
        System.out.println(empleado1.getEmpresa().getNombreEmpresa());

        System.out.println("----------------------------------");

        //LEER Y MODIFICAR EL ROL DEL EMPLEADO
        System.out.println(empleado1.getRol());
        empleado1.setRol(Tipo.administrador);
        System.out.println(empleado1.getRol());

        System.out.println("----------------------------------");

        //CREAR INSTANCIA DE LA CLASE MovimientoDinero
        MovimientoDinero movimiento1=new MovimientoDinero(3700000,
                "consignacion mantenimiento de equipo");

        //LEER Y MODIFICAR EL MONTO DEL MOVIMIENTO
        System.out.println(movimiento1.getMontoMovimiento());
        movimiento1.setMontoMovimiento(4800500);
        System.out.println(movimiento1.getMontoMovimiento());

        System.out.println("----------------------------------");

        //CREAR MONTOS POSITIVOS Y NEGATIVOS
        movimiento1.CrearTipoMonto(TipoMonto.ingreso);
        System.out.println(movimiento1.getTipoMonto());

        System.out.println("----------------------------------");

        //LEER Y MODIFICAR EL CONCEPTO DEL MOVIMIENTO
        System.out.println(movimiento1.getConceptoMovimiento());
        movimiento1.setConceptoMovimiento("pago compra de Procesador INTEL i7");
        System.out.println(movimiento1.getConceptoMovimiento());

        System.out.println("----------------------------------");

        //DEFINIR QUE USUARIO FUE ENCARGADO DEL REGISTRAR EL MOVIMIENTO
        movimiento1.DefinirUsuarioMovimiento(empleado1);
        System.out.println(movimiento1.getUsuarioMovimiento());















    }
}
