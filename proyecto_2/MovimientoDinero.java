package proyecto;

enum TipoMonto{
    ingreso,gasto
}

public class MovimientoDinero {

    private double montoMovimiento;
    private TipoMonto tipoMonto;
    private String conceptoMovimiento;
    private Empleado empleado;

    public MovimientoDinero(double montoMovimiento, String conceptoMovimiento) {
        this.montoMovimiento = montoMovimiento;
        this.conceptoMovimiento = conceptoMovimiento;

    }

    public double getMontoMovimiento() {
        return montoMovimiento;
    }

    public void setMontoMovimiento(double montoMovimiento) {
        this.montoMovimiento = montoMovimiento;
    }

    public String getConceptoMovimiento() {
        return conceptoMovimiento;
    }

    public void setConceptoMovimiento(String conceptoMovimiento) {
        this.conceptoMovimiento = conceptoMovimiento;
    }

    public void DefinirUsuarioMovimiento(Empleado empleado){
        this.empleado=empleado;
    }

    public String getUsuarioMovimiento(){
        return empleado.getNombreEmpleado();
    }

    public void CrearTipoMonto(TipoMonto tipoMonto){
        this.tipoMonto=tipoMonto;
    }

    public TipoMonto getTipoMonto(){
        return tipoMonto;
    }


}
