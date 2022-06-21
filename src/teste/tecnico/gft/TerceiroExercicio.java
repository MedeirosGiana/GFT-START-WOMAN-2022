package teste.tecnico.gft;
/*
Faça um programa que receba cinco idades, pesos e Alturas e que calcule
e mostre:
• A média das idades das dez pessoas;
• A quantidade de pessoas com peso superior a 90 quilos e altura inferior
a 1,50;
• A porcentagem de pessoas com idade entre 10 e 30 anos que medem mais de 1,90 de altura
 */

import java.util.Scanner;

   public class TerceiroExercicio {
       public static void main(String[] args) {
           final  Scanner scan = new Scanner(System.in);
           int idade [] = new int[5];
           double peso [] = new double[5];
           double altura [] = new double[5];

           for (int i = 0; i < 5; i++){
               System.out.println("Informe uma idade: ");
               idade[i] = scan.nextInt();

               System.out.println("Informe o peso: ");
               peso[i] = scan.nextDouble();

               System.out.println("Informe a altura: ");
               altura[i] = scan.nextDouble();
           }
           double somaIdades = 0;
           int qtdPessoaPesoSuper90 = 0;
           int qtdIdadePessoaEntre10E30 = 0;

           for (int i =0; i < 5; i++){
                 somaIdades += idade[i];

               if (peso[i] < 90 && altura[i] > 1.50)
                 qtdPessoaPesoSuper90 ++;

               if (idade[i] > 10 || idade[i] < 30 && altura[i] > 1.90)
                   qtdIdadePessoaEntre10E30++;
               }

           System.out.println("Media da idade: "+ somaIdades /2);
           System.out.println("Quantidade de pessoas com peso superior a 90 quilos e altura inferior que 1,50: " +qtdPessoaPesoSuper90);
           System.out.println("Porcentagem de pessoas com idade entre 10 e 30 anos entre as pessoas que medem mais de 1,90: "+ qtdIdadePessoaEntre10E30 * 100/5 + "%");
           }

       }

