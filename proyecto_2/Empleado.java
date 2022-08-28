package proyecto;

import java.util.ArrayList;
enum Tipo{
    administrador,operativo
}
public class Empleado {

    private String nombreEmpleado;
    private String correo;
    private Tipo rol;
    private Empresa empresa;

    public Empleado(String nombreEmpleado, String correo, Tipo rol, Empresa empresa) {
        this.nombreEmpleado = nombreEmpleado;
        this.correo = correo;
        this.rol = rol;
        this.empresa = empresa;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Tipo getRol() {
        return rol;
    }

    public void setRol(Tipo rol) {
        this.rol = rol;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }
}
