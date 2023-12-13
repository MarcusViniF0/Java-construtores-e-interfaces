package Heranca;

public class Cachorro extends Animal{
    public Cachorro(String nome){
        super(nome);
    }
    public void latir(){
        System.out.printf("O %s comeu\n", getNome(),"!");
    }
    public void lamber(){
        System.out.printf("O %s comeu\n", getNome(),"!");
        System.out.println();
    }
}
