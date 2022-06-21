package teste.tecnico.gft;
/*
2. Faça um programa que apresente o menu de opções a seguir:
Menu de opções:

1. Média aritmética
2. Média ponderada
3. Sair
Digite a opção desejada:
Na opção 1: receber duas notas, calcular e mostrar a média aritmética.
Na opção 2: receber três notas e seus respectivos pesos, calcular e mostrar
a média ponderada.
Na opção 3: sair do programa.
Verifique a possibilidade de opção inválida, mostrando uma mensagem.

 */

import java.util.Scanner;

public class SegundoExercicio {

    final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {
            System.out.println("1. Média aritmética");
            System.out.println("2. Média ponderada");
            System.out.println("3. Sair");

            final int escolha = scanner.nextInt();

            switch (escolha){
                case 1:  mediaAritimetica();
                case 2:  mediaPonderada();
                case 3:  return;
                default: System.out.println("Opção inválida");
            }
        }
    }

    private static void mediaAritimetica() {
        System.out.print("Insira a nota 1: ");
        final Double notaUm = scanner.nextDouble();

        System.out.print("Insira a nota 2: ");
        final Double notaDois = scanner.nextDouble();

        System.out.println("A média aritmética é: " + (notaUm + notaDois) / 2);
    }

    private static void mediaPonderada() {
        System.out.print("Insira a nota 1: ");
        final Double notaUm = scanner.nextDouble();
        System.out.print("Insira o peso da nota 1: ");
        final int pesoNotaUm = scanner.nextInt();

        System.out.print("Insira a nota 2: ");
        final Double notaDois = scanner.nextDouble();
        System.out.print("Insira o peso da nota 2: ");
        final int pesoNotaDois = scanner.nextInt();

        System.out.print("Insira a nota 3: ");
        final Double notaTres = scanner.nextDouble();
        System.out.print("Insira o peso da nota 3: ");
        final int pesoNotaTres = scanner.nextInt();

        final int somaDosPesos = pesoNotaUm + pesoNotaDois + pesoNotaTres;
        final Double resultadoNotaUm = notaUm * pesoNotaUm;
        final Double resultadoNotaDois = notaDois * pesoNotaDois;
        final Double resultadoNotaTres = notaTres * pesoNotaTres;

        System.out.println("A média ponderada é: " + (resultadoNotaUm + resultadoNotaDois + resultadoNotaTres) / somaDosPesos);
    }
}

