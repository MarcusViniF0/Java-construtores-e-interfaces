package treino_interface;

public class CalculadorArea {
    /*
        Quadrado,Circulo
        Circulo, Quadrado
        Circulo, Circulo
        Quadrado,Quadrado
     */
    public double somarAreas(FiguraGeometrica quadrado, FiguraGeometrica circulo){
        double totalArea = quadrado.calcularArea() +circulo.calcularArea();
        return totalArea;
    }
}
