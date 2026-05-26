import java.util.*;

public class Executar {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner (System.in);
        float valor;

        Titular pessoa = new Titular();

        pessoa.nome = "João";
        // pessoa.status();

        do{
            valor = scanner.nextInt();
        System.out.println("Digite o valor que você quer depositar ou sacar ou 0 para sair");
            System.out.println("Você depositou " + valor);

        } while (valor != 0);

        scanner.close();
        }

    }
