package Heranca;

public class Animal {
    private String nome;

    public Animal(String _nome2){
        this.nome=_nome2;
    }

    public void comer(){
        System.out.printf("O %s comeu\n",nome,"!");
    }
    public void beber(){
         System.out.printf("O %s bebeu", nome,"!");
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
