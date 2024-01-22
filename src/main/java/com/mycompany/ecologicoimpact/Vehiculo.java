public class Vehiculo implements ImpactoEcologico {
    private double mantenimiento;
    private double reciclaje;
    private double modalidadUso;

    public Vehiculo(double mantenimiento, double reciclaje, double modalidadUso) {
        this.mantenimiento = mantenimiento;
        this.reciclaje = reciclaje;
        this.modalidadUso = modalidadUso;
    }

    @Override
    public double calcularImpactoEcologico() {
        return mantenimiento + reciclaje + modalidadUso;
    }

    @Override
    public String getIdentificacion() {
        return "Vehiculo";
    }
}

