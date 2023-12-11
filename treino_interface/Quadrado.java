package treino_interface;

public class Quadrado implements FiguraGeometrica{
    @Override
    public double calcularArea() {
        return Math.pow(lado, 2);

    }
    //Atributo
    int lado;
    public int getLado() {
        return lado;
    }

    //Getters e setters
    public void setLado(int lado) {
        this.lado = lado;
    }
    //Construtor
    public Quadrado(int lado){
        this.lado=lado;
    }
}
