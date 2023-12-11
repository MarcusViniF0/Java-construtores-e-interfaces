package treino_interface;

public class App {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(2);
        Quadrado quadrado=new Quadrado(5);

        CalculadorArea calculador=new CalculadorArea();
        System.out.println(calculador.somarAreas(quadrado, quadrado));
    }
}
