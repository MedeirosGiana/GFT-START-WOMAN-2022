package teste.tecnico.gft;
/*As GFT Brasil resolveu dar um aumento de salário aos seus colaboradores
        e lhe contrataram para desenvolver o programa que calculará os reajustes.
        Faça um programa que recebe o salário de um colaborador e o reajuste
        segundo o seguinte critério, baseado no salário atual;
        a. Salários até R$ 280,00 (incluindo): aumento de 20%;
        b. Salários entre R$ 280,00 e R$700,00: aumento de 15%;
        c. Salários entre R$ 700,00 e R$ 1500,00: aumento de 10%;
        d. Salários de R$ 1500,00 em diante: aumento de 5%
        Após o aumento ser realizado; informe na tela;
a. O salário antes do reajuste;
b. O percentual de aumento aplicado;
c. O valor do aumento;
d. O novo salário, após o aumento.
        */

import java.util.Scanner;

public class AjusteSalario {
    public static void main(String[] args) {
        //entrada da scanner
        Scanner scan = new Scanner(System.in);

        //declaração das variaveis
        double salarioAtual;
        double salarioNovo;
        double reajuste;

        //entrada do salário atual
        salarioAtual = scan.nextDouble();
        System.out.println("Digite o salario atual do colaborador: ");

        //calculo do reajuste conforme critérios
        if (salarioAtual == 280){
            reajuste = 0.20f * salarioAtual;
        }if (salarioAtual == 280 || salarioAtual <= 700){
            reajuste = 0.15f *salarioAtual;
        } else if (salarioAtual == 700 || salarioAtual <= 1500) {
            reajuste = 0.10f *salarioAtual;
        }else {
            reajuste = 0.05f *salarioAtual;
            //novo salario
            salarioNovo = reajuste + salarioAtual;
            System.out.println("Salario Novo: "+ salarioNovo);
        }

        System.out.println("Salario antigo: "+ salarioAtual );
        System.out.println("Valor do aumento: " + reajuste
        );

    }
}
