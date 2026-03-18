import java.util.*;




public class exercicio_4 {
    public static void main (String[] args){
        ArrayList<Integer> numeros = new ArrayList<>();
        ArrayList<Integer> par = new ArrayList<>();
        ArrayList<Integer> impar = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i< 5; i++ ){
        System.out.println("Informe o " + (i + 1) + "° número\n");
        numeros.add(scanner.nextInt());
        }

        System.out.println("Números digitados pelo usuário: ");
        System.out.println(numeros);


        for( int num : numeros){
            if(num % 2 == 0){
                par.add(num);
            }
            else {
                impar.add(num);
            }
        }

        System.out.println("Números impares: ");
        System.out.println(impar);

        System.out.println("Números pares: ");
        System.out.println(par);

        scanner.close();
        
    }
    
}
