package br.edu.up;

import java.util.Scanner;
import br.edu.up.Modelos.Produto;

public class Exercicio06 {
  public static void executar(){

    /* Faça um programa que receba o preço de custo de um produto e mostre o valor de venda. 
    Sabe-se que o preço de custo receberá um acréscimo de acordo com um percentual informado pelo usuário. */

    Produto produto = new Produto();
    Scanner scan = new Scanner(System.in);

    System.out.println("Informe o valor de custo do produto: ");
    double custo = scan.nextDouble();
    produto.setCusto(custo);
    System.out.println("Informe o percentual: ");
    double percentual = scan.nextDouble();
    produto.setPercentual(percentual);

    double valorVenda = produto.calcularValorVenda(produto.getCusto(), produto.getPercentual());
    
    System.out.printf("Custo do produto: R$%.2f%n", produto.getCusto());
    System.out.printf("Percentual para venda: %.2f%n", produto.getPercentual());
    System.out.printf("Valor de venda: R$%.2f%n", valorVenda);



    scan.close();
  }
}
