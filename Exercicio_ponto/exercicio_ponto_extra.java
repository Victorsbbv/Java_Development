import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.Period;
import java.util.Scanner;
 

public class exercicio_ponto_extra {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite a data prevista para o pagamento (dd/mm/aaaa): ");
    String prevista = scanner.nextLine();

    System.out.print("Digite a data efetiva para o pagamento (dd/mm/aaaa): ");
    String efetiva = scanner.nextLine();

    System.out.print("Digite o valor da dívida: ");
    double dinheiro = scanner.nextDouble();

    DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    LocalDate dataPrevista = LocalDate.parse(prevista, formato);
    LocalDate dataEfetiva = LocalDate.parse(efetiva, formato);

    if (dataEfetiva.isAfter(dataPrevista)) {
    long diasAtraso = ChronoUnit.DAYS.between(dataPrevista, dataEfetiva);
    double juros = dinheiro * 0.02;
    double total = dinheiro + juros;

    System.out.println("Pagamento com atraso de " + diasAtraso + " dias.");
    System.out.println("Juros de 2%: R$ " + juros);
    System.out.println("Total a pagar: R$ " + total);
} else {
    System.out.println("Pagamento no prazo! Valor: R$ " + dinheiro);
}

}
}
