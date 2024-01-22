public class Edificio implements ImpactoEcologico {
    private double mantenimiento;
    private double reciclaje;
    private double aislamientoEficiencia;

    public Edificio(double mantenimiento, double reciclaje, double aislamientoEficiencia) {
        this.mantenimiento = mantenimiento;
        this.reciclaje = reciclaje;
        this.aislamientoEficiencia = aislamientoEficiencia;
    }

    @Override
    public double calcularImpactoEcologico() {
        return (mantenimiento + reciclaje) / aislamientoEficiencia;
    }

    @Override
    public String getIdentificacion() {
        return "Edificio";
    }
}
