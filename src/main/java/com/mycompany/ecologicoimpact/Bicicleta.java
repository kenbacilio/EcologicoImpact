public class Bicicleta implements ImpactoEcologico {
    private double mantenimiento;
    private double reciclaje;
    private double componentesMateriales;

    public Bicicleta(double mantenimiento, double reciclaje, double componentesMateriales) {
        this.mantenimiento = mantenimiento;
        this.reciclaje = reciclaje;
        this.componentesMateriales = componentesMateriales;
    }

    @Override
    public double calcularImpactoEcologico() {
        return mantenimiento + reciclaje - componentesMateriales;
    }

    @Override
    public String getIdentificacion() {
        return "Bicicleta";
    }
}

