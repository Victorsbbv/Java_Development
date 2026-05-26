public class Pessoa {
    String nome;
    int idade;
    float altura;

    public void apresentar(){
    System.err.println("Olá! Meu nome é " + this.nome + " e tenho " + this.idade + " além de ter a altura de " + this.altura);
    }
}
