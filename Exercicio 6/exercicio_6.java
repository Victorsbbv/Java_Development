import java.util.*;




public class exercicio_6 {
    public static void main (String[] args){
        ArrayList<String> alunoslist = new ArrayList<>();

        int opcoes;
        String nomeBusca;

        Scanner scanner = new Scanner(System.in);

        do{
        System.out.println("===== Menu =====");
        System.out.println("[1] - Adicionar Aluno");
        System.out.println("[2] - Listar Alunos");
        System.out.println("[3] - Buscar Alunos");
        System.out.println("[4] - Remover Alunos");
        System.out.println("[5] - Sair");
            opcoes = scanner.nextInt();

        switch (opcoes) {
            case 1:
                System.out.println("Digite o nome do Aluno: ");
                alunoslist.add(scanner.next());
                System.out.println("Aluno adicionado com sucesso!");
                break;

                case 2:
                    if (alunoslist.isEmpty()) {
                        System.out.println("A lista está vazia no momento.");
                    }
                    else

                        for(int i = 0; i < alunoslist.size(); i++){
                    Collections.sort(alunoslist);
                    System.out.println ((i + 1) + " - " + (alunoslist.get(i)));
                        }
                    break;

                    case 3:
                        System.out.println("Digite o nome do Aluno para buscar: ");
                        nomeBusca = scanner.next(); 
                        if (alunoslist.contains(nomeBusca)){
                            System.out.println("Aluno encontrando!");
                            }
                            else {
                            System.out.println("Aluno não matriculado");
                         }
                        break;

                        case 4:
                            System.out.println("Digite o nome do Aluno para remover: ");
                        nomeBusca = scanner.next(); 
                        if (alunoslist.contains(nomeBusca)){
                            alunoslist.remove(nomeBusca);
                            System.out.println("Aluno removido!");
                            }
                            else {
                            System.out.println("Aluno não matriculado");
                         }
                            break;

                            case 5:
                                System.out.println("================== Fim do Programa ==================");
                            break;

                                default:
                                    System.out.println("Opção não existe");
        }
    } while (opcoes != 5);


        scanner.close();
        
    }
    
}
