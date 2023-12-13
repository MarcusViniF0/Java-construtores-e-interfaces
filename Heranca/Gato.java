package Heranca;

public class Gato extends Animal{
    public Gato(String nome){
        super("nome");
    }
    public void miar(){
        System.out.printf("O %s miou\n",getNome(),"!");
    }
}
