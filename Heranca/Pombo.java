package Heranca;

public class Pombo extends Animal{
    private int cartasEnviadas;

    public int getCartasEnviadas() {
        return cartasEnviadas;
    }
    public Pombo(String nome) {
        super(nome);
        cartasEnviadas = 10;
        //TODO Auto-generated constructor stub
    }
    public void voar(){
        System.out.printf("O %s voou\n",getNome(),"!");
    }
    public void fazerPru(){
        System.out.printf("O %s fez PRuuuuuuuuuuuuuuu\n",getNome(),"!");
    }
    public void enviarCarta(){
        System.out.printf("O %s enviou uma carta\n",getNome(),"!");
        this.cartasEnviadas++;
    }
}
