package br.edu.up;

import java.util.Scanner;
import br.edu.up.Modelos.Funcionario;

public class Exercicio16 {
  public static void executar(){

    /* Escrever um programa para uma empresa que decide dar um reajuste a seus 584 funcionários de acordo com os seguintes critérios: 
     * a. 50% para aqueles que ganham menos do que três salários mínimos;
     * b. 20% para aqueles que ganham entre três até dez salários mínimos;
     * c. 15% para aqueles que ganham acima de dez até vinte salários mínimos;
     * d. 10% para os demais funcionários. */

     Scanner scan = new Scanner(System.in);
     Funcionario funcionario = new Funcionario();
     double ajusteSalario;

     System.out.println("Informe o salário do funcionário: ");
     double salario = scan.nextDouble();
     funcionario.setSalario(salario);
     System.out.println("Informe o valor do salário mínimo: ");
     double salarioMinimo = scan.nextDouble();

     if (funcionario.getSalario() < salarioMinimo * 3) {
      ajusteSalario = funcionario.getSalario() + (funcionario.getSalario() * 0.50);
      System.out.printf("Novo salário: R$%.2f%n", ajusteSalario);
     } else if (funcionario.getSalario() > salarioMinimo * 3 && funcionario.getSalario() <= salarioMinimo * 10) {
      ajusteSalario = funcionario.getSalario() + (funcionario.getSalario() * 0.20);
      System.out.printf("Novo salário: R$%.2f%n", ajusteSalario);
     } else if (funcionario.getSalario() > salarioMinimo * 10) {
      ajusteSalario = funcionario.getSalario() + (funcionario.getSalario() * 0.15);
      System.out.printf("Novo salário: R$%.2f%n", ajusteSalario);
     } else {
      ajusteSalario = funcionario.getSalario() + (funcionario.getSalario() * 0.10);
      System.out.printf("Novo salário: R$%.2f%n", ajusteSalario);
     }
     



     scan.close();
  }
}
