package br.edu.up;

import java.util.Scanner;
import br.edu.up.Modelos.Funcionario;

public class Exercicio17 {
  public static void executar(){

    /* Leia o nome do funcionário, seu salário e o valor do salário mínimo. Calcule o seu novo salário reajustado. 
    Escrever o nome do funcionário, o reajuste e seu novo salário. Calcule quanto à empresa vai aumentar sua folha de pagamento. */

    Scanner scan = new Scanner(System.in);
    Funcionario funcionario = new Funcionario();

    System.out.println("Informe o nome do funcionário: ");
    String nome = scan.nextLine();
    funcionario.setNome(nome);
    System.out.println("Informe o valor do salário: ");
    double salario = scan.nextDouble();
    funcionario.setSalario(salario);
    System.out.println("Informe o valor do salário mínimo: ");
    double salarioMinimo = scan.nextDouble();
    
    double nSal = funcionario.calcularNovoSalario(funcionario.getSalario(), salarioMinimo);

    System.out.println("Funcinário: " + funcionario.getNome());
    System.out.printf("Salário atual: R$%.2f%n", funcionario.getSalario());
    System.out.printf("Novo salário é: R$%.2f%n", nSal);
    double aumentoFolha = nSal - funcionario.getSalario();
    System.out.printf("O valor referente ao aumento na folha de pagamento é: R$%.2f%n", aumentoFolha);



    scan.close();
  }
}
