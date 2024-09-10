package tarefa_wrappers;

import java.util.Scanner;

public class ConversaoWrapper {

    public static void main(String[] args) {
        // Cria um objeto Scanner para capturar a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Pede ao usuário para digitar um número
        System.out.println("Digite um número inteiro: ");
        int valorPrimitivo = scanner.nextInt();  // Variável primitiva

        // Converte o tipo primitivo para o tipo wrapper
        Integer valorWrapper = Integer.valueOf(valorPrimitivo);  // Tipo wrapper

        // Imprime os valores
        System.out.println("Valor primitivo: " + valorPrimitivo);
        System.out.println("Valor wrapper: " + valorWrapper);

        // Fechar o scanner
        scanner.close();
    }
}
