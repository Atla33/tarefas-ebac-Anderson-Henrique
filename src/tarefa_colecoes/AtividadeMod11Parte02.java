package tarefa_colecoes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AtividadeMod11Parte02 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite os nomes e sexos separados por vírgula (Ex: Anderson - M, Rafaela - F):");
        String entrada = scanner.nextLine();

        if (entrada.isEmpty()) {
            System.out.println("Nenhuma entrada foi inserida.");
        } else {
            String[] pessoasArray = entrada.split(",");

            List<String> masculino = new ArrayList<>();
            List<String> feminino = new ArrayList<>();

            for (String pessoa : pessoasArray) {
                String[] partes = pessoa.trim().split(" - ");

                if (partes.length == 2) {
                    String nome = partes[0].trim();
                    String sexo = partes[1].trim().toUpperCase();

                    if (sexo.equals("M")) {
                        masculino.add(nome + " - M");
                    } else if (sexo.equals("F")) {
                        feminino.add(nome + " - F");
                    } else {
                        System.out.println("Entrada inválida para: " + pessoa);
                    }
                } else {
                    System.out.println("Formato incorreto: " + pessoa);
                }
            }

            System.out.println("Lista Masculino: " + masculino);
            System.out.println("Lista Feminino: " + feminino);
        }

        scanner.close();
    }
}
