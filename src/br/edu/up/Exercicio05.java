package br.edu.up;

import java.util.Scanner;
import br.edu.up.Modelos.Compra;

public class Exercicio05 {
  public static void executar(){

    /* A Loja Mamão com Açúcar está vendendo seus produtos em 5 (cinco) prestações sem juros.
    Faça um programa que receba um valor de uma compra e mostre o valor das prestações. */

    Compra compra = new Compra();
    Scanner scan = new Scanner(System.in);

    System.out.println("Informe o valor total da compra: ");
    double valorCompra = scan.nextDouble();
    compra.setValorCompra(valorCompra);

    double parcela = compra.calcularPrestacao(compra.getValorCompra());

    System.out.printf("Valor total da compra: R$%.2f%n", compra.getValorCompra());
    System.out.printf("Valor das parcelas: R$%.2f%n", parcela);



    scan.close();
  }
}
