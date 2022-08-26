package proyecto;

import java.util.ArrayList;

public class Empleado {

    private String nombreEmpleado;
    private String correo;
    private String rol;
    private Empresa empresa;

    public Empleado(String nombreEmpleado, String correo, String rol, Empresa empresa) {
        this.nombreEmpleado = nombreEmpleado;
        this.correo = correo;
        this.rol = rol;
        this.empresa = empresa;
        if (rol=="administrador" || rol=="operativo"){
            this.rol = rol;
        }
        else {
            this.rol = null;
        }
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

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        if (rol=="administrador" || rol=="operativo"){
            this.rol = rol;
        }
        else {
            System.out.println("El rol debe ser operativo o administrador, todo en minusculas");
        }
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }
}
