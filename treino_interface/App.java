package treino_interface;

public class App {
    public static void main(String[] args) {
       Circulo circuloPequeno = new Circulo(2);
        System.out.println(circuloPequeno.calcularArea());
    
        Quadrado quadrado=new Quadrado(5);
        System.out.println(quadrado.calcularArea());
    }
}
