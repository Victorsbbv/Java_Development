import java.util.*;




public class exercicio_5 {
    public static void main (String[] args){
        ArrayList<Float> operacoes = new ArrayList<>();

        float credito = 0, debito = 0, cpmf, total = 0, operacao;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o saldo inicial");
            total = scanner.nextFloat();

        do{

            System.out.println("Digite o valor que você quer depositar/sacar ou 0 para finalizar");
            operacao = scanner.nextFloat();
            operacoes.add(operacao);

            if(operacao < 0){
                debito += operacao;
                total += operacao;
            }
            else {
                credito += operacao;
                total += operacao;
            }


        } while(operacao != 0);

        cpmf = -(debito) * 0.004f;

        System.out.println("O total de creditos foi: " + credito);
        System.out.println("O total de débitos foi: " + debito);
        System.out.println("O total de C.P.M.F foi: " + cpmf);
        total = total - cpmf;
        System.out.println("O saldo final foi: " + total);
        System.out.println("Operações Realizadas: ");
        System.out.println(operacoes);


        scanner.close();
        
    }
    
}
