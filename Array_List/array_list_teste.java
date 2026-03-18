import java.util.*;




public class array_list_teste {
    public static void main (String[] args){
        ArrayList<String> nomes = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        nomes.add("Ana");
        nomes.add("Carlos");
        nomes.add("Daniel");
        nomes.add("Marcelo");
        nomes.add("Pedro");

        System.out.print(nomes);

        System.out.print("Informe o Nome\n");
        nomes.add(scanner.next());
        System.out.println(nomes);
        System.out.println(nomes.get(1));

        nomes.remove("Ana");

        System.out.println("Tamanho da Lista: " + nomes.size());


        for(int i = 0; i < nomes.size(); i++){
            System.out.println(nomes.get(i));
        }

        for(String nome : nomes){
            System.out.println(nome);
        }

        Collections.sort(nomes);

        System.out.println("\n");
        System.out.println("\n");
        System.out.println(nomes);

        Collections.reverse(nomes);

        System.out.println("\n");
        System.out.println("\n");
        System.out.println(nomes);

        Collections.shuffle(nomes);

        System.out.println("\n");
        System.out.println("\n");
        System.out.println(nomes);

        scanner.close();
        
    }
    
}
