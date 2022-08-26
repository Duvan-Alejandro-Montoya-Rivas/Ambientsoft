package proyecto;

import java.util.ArrayList;

public class Empresa {
    private int nit;
    private String nombreEmpresa;
    private int telefono;
    private String direccion;
    private ArrayList<Empleado> empleados;
    private ArrayList<MovimientoDinero> movimientos;


    public Empresa(int nit, String nombreEmpresa, int telefono, String direccion) {
        this.nit = nit;
        this.nombreEmpresa = nombreEmpresa;
        this.telefono = telefono;
        this.direccion = direccion;
        this.empleados=new ArrayList<Empleado>();
        this.movimientos=new ArrayList<MovimientoDinero>();
    }

    public int getNit() {
        return nit;
    }

    public void setNit(int nit) {
        this.nit = nit;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}



