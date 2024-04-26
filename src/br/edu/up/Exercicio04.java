package br.edu.up;

import java.util.Scanner;
import br.edu.up.Modelos.Moeda;

public class Exercicio04 {
  public static void executar(){

    /* Elaborar um programa que efetue a apresentação do valor da conversão em real (R$) de um valor lido em dólar (US$). 
    O programa deverá solicitar o valor da cotação do dólar e também a quantidade de dólares disponíveis com o usuário. */

    Moeda moeda = new Moeda();
    Scanner scan = new Scanner(System.in);

    System.out.println("Informe o valor em dólares (U$): ");
    double valor = scan.nextDouble();
    moeda.setValor(valor);
    System.out.println("Informe a cotação do dólar: ");
    double cotacao = scan.nextDouble();
    moeda.setCotacao(cotacao);

    double valorFinal = moeda.converterMoeda(moeda.getValor(), moeda.getCotacao());

    System.out.printf("Valor em dólares: U$%.2f%n", moeda.getValor());
    System.out.printf("Cotação do dia: %.2f%n", moeda.getCotacao());
    System.out.printf("Valor convertido em reais: R$%.2f%n", valorFinal);


    scan.close();
  }
}
