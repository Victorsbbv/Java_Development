public class Exemplos {
    public static void main(String[] args) throws Exception {

        Caneta c1 = new Caneta();
        c1.cor = "Azul";
        c1.ponta = 0.5f;
        c1.tampa = true;

        Caneta c2 = new Caneta();
        c2.cor = "Preta";
        c2.ponta = 0.7f;
        c2.tampa = true;

        c1.status();
        c1.rabiscar();
        c2.destampar();
        c2.status();
        c2.rabiscar();
    }
}
