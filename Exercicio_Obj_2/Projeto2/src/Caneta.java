public class Caneta {
    String cor;
    float ponta;
    boolean tampa = true;

    public void tampar() {
        this.tampa = true;
    }

    public void destampar() {
        this.tampa = false;
    }

    public void rabiscar() {
        if(this.tampa == true) {
            System.out.println("Não posso rabiscar");
        }
        else {
            System.out.println("Rabiscando...");
        }
    }

    public void status(){
        System.out.println(this.cor);
        System.out.println(this.ponta);
        System.out.println(this.tampa);
    }


}
