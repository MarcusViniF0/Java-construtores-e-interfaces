package Heranca;

public class App {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("Caramelo");
        cachorro.comer();
        cachorro.latir();
    
        Gato gato= new Gato("Snowbell");
        gato.miar();

        Dragão dragão=new Dragão("Dragão branco de olhos azuis");
        dragão.voar();
        dragão.soltarFogo();

        Pombo pombinha = new Pombo("Pombo correio Sedex");
        pombinha.enviarCarta();
        pombinha.fazerPru();

    }
}
