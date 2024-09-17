package tarefa_colecoes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class AtividadeMod11Parte01 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite os nomes separados por vírgula:");
        String nomesStr = scanner.nextLine();


        if (nomesStr.isEmpty()) {
            System.out.println("Nenhum nome foi inserido.");
        } else {

            String[] nomesArray = nomesStr.split(",");

            List<String> nomes = new ArrayList<>();

            for (String nome : nomesArray) {
                nomes.add(nome.trim());
            }

            System.out.println("Lista de nomes antes da ordenação: " + nomes);

            Collections.sort(nomes);

            System.out.println("Lista de nomes após a ordenação: " + nomes);
        }

        scanner.close();
    }
}
