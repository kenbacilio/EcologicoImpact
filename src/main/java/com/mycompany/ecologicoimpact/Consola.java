import java.util.ArrayList;

public class Consola {
    public static void main(String[] args) {
        Edificio edificio = new Edificio(100, 50, 0.8);
        Vehiculo vehiculo = new Vehiculo(150, 75, 1.2);
        Bicicleta bicicleta = new Bicicleta(30, 15, 0.5);

        ArrayList<ImpactoEcologico> objetos = new ArrayList<>();
        objetos.add(edificio);
        objetos.add(vehiculo);
        objetos.add(bicicleta);

        for (ImpactoEcologico objeto : objetos) {
            System.out.println(objeto.getIdentificacion() + " - Impacto Ecológico: " + objeto.calcularImpactoEcologico());
        }
    }
}
