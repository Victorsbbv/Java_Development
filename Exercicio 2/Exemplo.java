import java.util.Scanner;


 class Exemplo {
    public static void main (String[] args){
    Scanner scanner = new Scanner(System.in);

    int ant, suc, numero;

    System.out.println("Digite o numero\n");

             numero = scanner.nextInt();

             ant = numero - 1;
             suc = numero + 1;

             System.out.println("Sucessor: \n" + suc );
             System.out.println("Antecessor: \n" + ant);

             scanner.close(); 
    
}
}
