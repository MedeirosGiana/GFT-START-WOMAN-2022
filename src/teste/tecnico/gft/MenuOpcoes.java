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

public class MenuOpcoes {
    public static void main(String[] args) {
        float mediaAritimetica;
        float mediaPonderada;
        int opcao;
        int nota1;
        int nota2;
        String mensagem = "Digite um valor válido: ";

        Scanner entrada = new Scanner(System.in);


        System.out.println("Digite sua opcao: ");
        opcao = new  entrada.nextInt();


        System.out.println("O que deseja fazer?");
        System.out.println("1 - Calcula media aritimetica, 2 - Calcular media ponderada, 3 - sair ");
        opcao = entrada.nextInt();
        switch(opcao) {
            case 1:
                System.out.println("Digite a sua opcao: ");
                nota1 = entrada.nextInt();
                nota2 = entrada.nextInt();
                break;


        }
    }
