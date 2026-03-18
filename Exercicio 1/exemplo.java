import java.util.Scanner;

class Exemplo {
    public static void main (String[] args){
        float valor, total = 0, money, creditotal = 0, debitostotal = 0, saldo, imposto;
    

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o seu saldo incial");
        saldo = scanner.nextInt();

        total = saldo;

         do{
            System.out.println("Digite 1 para adicionar no saldo\n");
            System.out.println("Digite 2 para remover saldo\n");
            System.out.println("Digite 0 para encerrar o programa\n");

             valor = scanner.nextInt();

            if (valor == 1){
                System.out.println("Qual o valor que você quer adicinar?\n");
                money = scanner.nextInt();
                total += money;
                creditotal += money;
                System.out.println("Adicionado: " + money);
                System.out.println("Total: " + total);
            }

            if (valor == 2){
                System.out.println("Qual o valor que você quer remover?\n");
                money = scanner.nextInt();
                total -= money;
                debitostotal -= money;
                System.out.println("Removido: " + money);
                System.out.println("Total: " + total);
            }



        }while(valor != 0);

        imposto = debitostotal * 0.004f;

            System.out.println("Total de Créditos: " + creditotal);
            System.out.println("Total de Débitos: " + debitostotal);
            System.out.println("C.P.M.F: " + imposto);
            total = total + imposto;
            System.out.println("Saldo: " + total);



       scanner.close(); 
    }
}