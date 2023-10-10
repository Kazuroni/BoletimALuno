package boletim;

import java.util.Scanner;

public class boletim {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de disciplinas no semestre: ");
        int quantidadeDisciplinas = scanner.nextInt();

        System.out.print("Digite a media minima para aprovacao: ");
        double mediaMinimaAprovacao = scanner.nextDouble();

        scanner.nextLine();

        String[] nomesDisciplinas = new String[quantidadeDisciplinas];
        double[] notasP1 = new double[quantidadeDisciplinas];
        double[] notasP2 = new double[quantidadeDisciplinas];
        double[] notasTrabalho = new double[quantidadeDisciplinas];

        for (int i = 0; i < quantidadeDisciplinas; i++) {
            System.out.print("Digite o nome da disciplina " + (i + 1) + ": ");
            nomesDisciplinas[i] = scanner.nextLine();

            System.out.print("Digite a nota da P1 da disciplina " + (i + 1) + ": ");
            notasP1[i] = scanner.nextDouble();

            System.out.print("Digite a nota da P2 da disciplina " + (i + 1) + ": ");
            notasP2[i] = scanner.nextDouble();

            System.out.print("Digite a nota do trabalho da disciplina " + (i + 1) + ": ");
            notasTrabalho[i] = scanner.nextDouble();

            scanner.nextLine();
        }

        System.out.println("\nBoletim do Aluno:");

        for (int i = 0; i < quantidadeDisciplinas; i++) {
            double mediaDisciplina = (notasP1[i] + notasP2[i] + notasTrabalho[i]) / 3.0;
            String situacao = mediaDisciplina >= mediaMinimaAprovacao ? "Aprovado" : "Reprovado";

            System.out.println("Disciplina: " + nomesDisciplinas[i]);
            System.out.println("Media: " + mediaDisciplina);
            System.out.println("situacao: " + situacao);
            System.out.println();
        }

        scanner.close();
    }
}