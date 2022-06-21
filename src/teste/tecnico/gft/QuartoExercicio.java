package teste.tecnico.gft;

import java.util.Scanner;

/*
4. Escreva um programa que pergunte o dia, mês e ano do aniversário de uma
pessoa e diga se a data é válida ou não. Caso não seja, diga o motivo.
Suponha que todos os meses têm 31 dias e que estejamos no ano de 2000.
Caso a data esteja correta imprima “Data válida”.
 */
public class QuartoExercicio {
    public static void main(String[] args) {
        final Scanner scan = new Scanner(System.in);
        int dia;
        int mes;
        int ano;

        System.out.println("Informe o dia do seu aniversario: ");
        dia = scan.nextInt();

        System.out.println("Informe o mes do seu aniversario: ");
        mes = scan.nextInt();

        System.out.println("Informe o ano do seu aniversario: ");
        ano = scan.nextInt();

        if (dia > 31 && ano > 2022){
            System.out.println("Por gentileza, informe uma data e um ano validos.");
        }else {
            System.out.println("Data valida.");
        }

    }
}
