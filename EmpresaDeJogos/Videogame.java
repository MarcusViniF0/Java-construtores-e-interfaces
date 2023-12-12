package EmpresaDeJogos;

public class Videogame{
    private boolean estaligado;
    private Jogo jogo;

    public void ligar(){
        System.out.println("Ligando o videogame ...");
        this.estaligado = true;
    }
    public void jogar(Jogo jogo){
        if(estaligado == true){
        System.out.println("Iniciando o jogo ...");
        this.jogo=jogo;
        jogo.jogar();
        }else{
            System.out.println("Videogame está desligado!");
        }
    }
    public void fechar(){
        if(estaligado == true){
        System.out.println("Fechando o jogo ...");
        boolean temJogoRodando= jogo != null;
        if(temJogoRodando){
            jogo.fechar();
            jogo = null; //estou definindo o valor de null que significa que não está rodando!
        }else{
            System.out.println("Não tem nenhum jogo rodando!");
        }
        }else{
            System.out.println("Videogame está desligado!");
        }
    }
}