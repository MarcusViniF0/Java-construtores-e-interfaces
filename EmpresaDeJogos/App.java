package EmpresaDeJogos;

public class App {
    public static void main(String[] args) {
        //encapsulamento->interface
        Videogame xDevOne = new Videogame();
        xDevOne.ligar();
        xDevOne.jogar(new TiroAoAlvoOnline());
        xDevOne.fechar();
    }
}
