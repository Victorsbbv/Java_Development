public class Exemplo {
    public static void main(String[] args) throws Exception {
        Pessoa p1 = new Pessoa();
        p1.nome = "Ana";
        p1.idade = 22;
        p1.altura = 1.70f;
        p1.apresentar();

        Pessoa p2 = new Pessoa();
        p2.nome = "João";
        p2.idade = 20;
        p2.altura = 1.79f;
        p2.apresentar();
    }
}
