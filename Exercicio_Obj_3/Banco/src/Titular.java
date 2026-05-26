public class Titular {

    String nome;
    float saldo;

    public void depositar(float valor) {
        this.saldo += valor ;
    }

    public void sacar(float valor) {
        this.saldo -= valor ;
        if(valor > saldo){
            System.out.println("Você não pode sacar mais do que você tem pobre");
        }
    }


}
