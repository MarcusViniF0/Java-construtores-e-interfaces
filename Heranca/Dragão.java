package Heranca;

public class Dragão extends Animal{

    public Dragão(String nome) {
        super(nome);
        //TODO Auto-generated constructor stub
    }
    public void soltarFogo(){
        System.out.printf("%s soltou uma bola de fogo\n", getNome());
    }
    public void voar(){
        System.out.printf("%s voou\n", getNome());
    }
}
