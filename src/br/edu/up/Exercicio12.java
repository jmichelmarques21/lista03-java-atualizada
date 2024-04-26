package br.edu.up;

import java.util.Scanner;
import br.edu.up.Modelos.Carro;

public class Exercicio12 {
  public static void executar(){

    /* A concessionária de veículos “CARANGO VELHO” está vendendo os seus veículos com desconto. 
    Faça um programa que calcule e exiba o valor do desconto e o valor a ser pago pelo cliente de vários carros. 
    O desconto deverá ser calculado de acordo com o ano do veículo. Até 2000 - 12% e acima de 2000 - 7%. 
    O sistema deverá perguntar se deseja continuar calculando desconto até que a resposta seja: “(N) Não”. 
    Informar total de carros com ano até 2000 e total geral. */

    Scanner scan = new Scanner(System.in);
    Carro carro = new Carro();

    double valorFinal;
    double valorTotal = 0;
    int soma = 0;
    char opcao;

    do {
      System.out.println("Informe o ano do veículo: ");
      int ano = scan.nextInt();
      carro.setAno(ano);
      System.out.println("Informe o valor de venda do veículo: ");
      double valor = scan.nextDouble();
      carro.setValor(valor);
      if (carro.getAno() <= 2000) {
        valorFinal = carro.getValor() - (carro.getValor() * 0.12);
        System.out.printf("Valor do carro com o desconto: R$%.2f%n", valorFinal);
        valorTotal += valorFinal;
        soma++;
      } else if (carro.getAno() > 2000) {
        valorFinal = carro.getValor() - (carro.getValor() * 0.07);
        System.out.printf("Valor do carro com o desconto: R$%.2f%n", valorFinal);
        valorTotal += valorFinal;
        soma++;
      }
      System.out.println("Deseja calcular o desconto para outro carro? (S / N)");
      opcao = scan.next().charAt(0);
    } while (opcao == 'S' || opcao == 's');
    System.out.println("Foram calculados os preços de " + soma + " veículos.");
    System.out.printf("O valor total dos carros vendidos é: R$%.2f%n", valorTotal);

    scan.close();

  }
}
