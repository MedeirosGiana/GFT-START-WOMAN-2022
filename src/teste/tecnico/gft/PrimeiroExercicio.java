package teste.tecnico.gft;
/*As GFT Brasil resolveu dar um aumento de salário aos seus colaboradores
        e lhe contrataram para desenvolver o programa que calculará os reajustes.
        Faça um programa que recebe o salário de um colaborador e o reajuste
        segundo o seguinte critério, baseado no salário atual;

        a. Salários até R$ 280,00 (incluindo): aumento de 20%;
        b. Salários entre R$ 280,00 e R$700,00: aumento de 15%;
        c. Salários entre R$ 700,00 e R$ 1500,00: aumento de 10%;
        d. Salários de R$ 1500,00 em diante: aumento de 5%*

        Após o aumento ser realizado; informe na tela;
a. O salário antes do reajuste;
b. O percentual de aumento aplicado;
c. O valor do aumento;
d. O novo salário, após o aumento.

        */

import java.util.Scanner;

public class PrimeiroExercicio {
    public static void main(String[] args) {
        //entrada do sistema
        Scanner scanner = new Scanner( System.in );
        //saida do sistema
        System.out.println("Informe salario do colaborador: ");
        double salarioColaborador = scanner.nextDouble();
        //variaveis
        int reajuste = 0;
        double valorDoAumento = 0.0;
        double novoSalario = 0.00;

        //condição conforme critérios:
        if (salarioColaborador == 280)
            reajuste = 20;
        else if (salarioColaborador >= 280 && salarioColaborador < 700)
            reajuste = 15;
        else if (salarioColaborador >= 700 && salarioColaborador < 1500)
            reajuste = 10;
        else if (salarioColaborador >= 1500)
            reajuste = 5;

        valorDoAumento = (salarioColaborador * reajuste) / 100;
        novoSalario = salarioColaborador + reajuste;

        System.out.println( "Salário atual do colaborador: " + salarioColaborador );
        System.out.println( "Reajuste: " + reajuste %2.f+ "%" );
        System.out.println( "Valor do aumento: " + valorDoAumento %2.f );
        System.out.println( "Novo salário: " + novoSalario %2.f );

    }
}

