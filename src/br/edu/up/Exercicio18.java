package br.edu.up;

import java.util.Scanner;
import br.edu.up.Modelos.Funcionario;

public class Exercicio18 {
  public static void executar(){

    /* Faça um programa que receba o nome a idade, o sexo e salário fixo de um funcionário. Mostre o nome e o salário líquido acrescido do abono conforme o sexo e a idade:
    Sexo Idade Abono
      M  >= 30 100,00
          < 30 50,00
      F
          >= 30 200,00
          < 30 80,00 */

    Scanner scan = new Scanner(System.in);
    Funcionario funcionario = new Funcionario();

    System.out.println("Digite o nome do funcionário: ");
    String nome = scan.nextLine();
    funcionario.setNome(nome);
    System.out.println("Digite a idade: ");
    int idade = scan.nextInt();
    funcionario.setIdade(idade);
    System.out.println("Digite o salário fixo: ");
    double salario = scan.nextDouble();
    funcionario.setSalario(salario);
    System.out.println("Informe o gênero (F / M): ");
    char genero = scan.next().charAt(0);
    funcionario.setGenero(genero);

    double abono = funcionario.calcularAbono(funcionario.getGenero(), funcionario.getIdade());
    double novoSalario = funcionario.getSalario() + abono;


    System.out.println();
    System.out.println("Nome do funcionário: " + funcionario.getNome());
    System.out.println("Idade: " + funcionario.getIdade());
    System.out.printf("Salário fixo: %.2f%n", funcionario.getSalario());
    System.out.println("Gênero: " + funcionario.getGenero());
    System.out.printf("Salário com abono: R$%.2f%n", novoSalario);




    scan.close();
  }
}
