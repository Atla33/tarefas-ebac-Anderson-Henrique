package tarefa_controle_de_fluxo;

import java.util.Scanner;

public class ResultadoAprovacao {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double nota1, nota2, nota3, nota4;

        System.out.println("Digite a primeira nota: ");
        nota1 = scanner.nextDouble();

        System.out.println("Digite a segunda nota: ");
        nota2 = scanner.nextDouble();

        System.out.println("Digite a terceira nota: ");
        nota3 = scanner.nextDouble();

        System.out.println("Digite a quarta nota: ");
        nota4 = scanner.nextDouble();

        double media = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.println("A sua média é: " + media);

        if(media >= 7) {
            System.out.println("Parabéns você foi aprovado!");
        } else if (media >= 5) {
            System.out.println("Ainda tem como recuperar, você está na recuperação!");
        } else {
            System.out.println("Não foi dessa vez, infelizmente você foi reprovado!");
        }

        scanner.close();
    }
}
