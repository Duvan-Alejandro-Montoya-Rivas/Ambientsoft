package proyecto;

public class MovimientoDinero {

    private double montoMovimiento;
    //private String tipoMonto;
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

    public Empleado DefinirUsuarioMovimiento(Empleado empleado){
        this.empleado=empleado;
        return this.empleado;
    }
}
