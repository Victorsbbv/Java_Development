/* Biblioteca para leitura de dados do teclado e arquivos */
import java.util.Scanner;
/* Biblioteca para usar listas dinâmicas (ArrayList) */
import java.util.ArrayList;
/* Biblioteca para representar e manipular arquivos */
import java.io.File;

import java.util.Collections;
 
class Usuario {
 
    String nome;
    Double espaco;
 
    public Usuario(String nome, Double espaco) {
        this.nome = nome;
        this.espaco = espaco;
    }
}
 
class Leitor {
    public static void main(String[] args) throws Exception {
 
        /* Lista que armazenará os contatos em memória */
        ArrayList<Usuario> lista = new ArrayList<>();
 
        /* Representa o arquivo contatos.txt */
        File arquivo = new File("consumo.txt");
 
        /* Verifica se o arquivo existe */
        if (arquivo.exists()) {
 
            /* Scanner usado para ler o arquivo */
            Scanner leitor = new Scanner(arquivo);
 
            /* Enquanto houver linhas no arquivo */
            while (leitor.hasNextLine()) {
 
                /* Lê uma linha completa */
                String linha = leitor.nextLine();
 
                /* Divide a linha usando ";" */
                String[] partes = linha.split(";");
 
                /* Guarda cada parte em variáveis */
                String nome = partes[0];
                Double espaco = Double.parseDouble(partes[1]);
 
                /* Cria um objeto Contato e adiciona ao ArrayList */
                lista.add(new Usuario(nome, espaco));
            }
 
            /* Fecha o leitor do arquivo */
            leitor.close();
        }



        double totalBytes = 0;
        for (Usuario c : lista) {
            totalBytes += c.espaco;
        }

        double mediaMB = totalBytes / lista.size();

        Collections.sort(lista, (a, b) -> a.nome.compareTo(b.nome));

        // Cabeçalho
        System.out.printf("%-4s %-15s %20s %15s%n", "Nr.", "Usuário", "Espaço utilizado", "% de uso");
        System.out.println("--------------------------------------------------------");

        // Linhas
        int nr = 1;
        for (Usuario c : lista) {
            double espacoMB = c.espaco / (1024 * 1024);
            double porcentagem = (c.espaco / totalBytes) * 100;

            System.out.printf("%-4d %-15s %17.2f MB %14.2f%n", nr, c.nome, espacoMB, porcentagem);
            nr++;
        }

        System.out.println("--------------------------------------------------------");
        System.out.printf("Espaço total ocupado: %.2f MB%n", totalBytes / (1024.0 * 1024.0));
        System.out.printf("Espaço médio ocupado: %.2f MB%n", (mediaMB / (1024.0 * 1024.0)));
    }
}