import java.util.*;




public class exercicio_3 {
    public static void main (String[] args){
        ArrayList<String> nomes = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        nomes.add("Carlos");
        nomes.add("Bruno");
        nomes.add("Ana");
        nomes.add("Pedro");

        System.out.println(nomes);

        nomes.remove("Ana");

        if (nomes.contains("Fernando")){
            System.out.println("Achei o Fernando!");
        }
        else {
            System.out.println("Fernando não está presente entre nós");
        }

        nomes.add(0, "Gustavo");

        nomes.add("Helena");

        Collections.sort(nomes);

        System.out.println(nomes);

        nomes.clear();

        System.out.println(nomes);

        scanner.close();
        
    }
    
}
