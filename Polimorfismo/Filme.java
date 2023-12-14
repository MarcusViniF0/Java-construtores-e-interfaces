package Polimorfismo;

public class Filme extends Video{
    private String audio;
    private String legenda;

    public Filme(String nome) {
        super(nome);
        this.audio = "portugues";
        this.legenda = "nenhuma";
    }
    public void play(){
        //sobreposição de metodo
        System.out.println("Play: filme"+ getNome());
    }
    public void play(String audio){
        //sobrecarga de metodo
        System.out.println("Play:" + toString());
        this.audio = audio;
    }
    public void play(String audio, String legenda){
        System.out.println("Play:" + toString());
        this.audio = audio;
    }
    @Override
    public String toString() {
        String infomacao = String.format("Filme %s, (audio %s, legenda %s)", getNome(), audio, legenda);
        return infomacao;
    }
}
