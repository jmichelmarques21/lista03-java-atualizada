package br.edu.up;

import java.util.Scanner;
import br.edu.up.Modelos.Vendedor;

public class Exercicio03 {
  public static void executar(){
    
    /*  Escrever um programa que leia o nome de um vendedor, o seu salário fixo e o total de vendas efetuadas por ele no mês (em dinheiro). 
    Sabendo que este vendedor ganha 15% de comissão sobre suas vendas efetuadas, informar o seu nome, o salário fixo e salário no final do mês. */

    Vendedor vendedor = new Vendedor();
    Scanner scan = new Scanner(System.in);

    System.out.println("Informe o nome do vendedor: ");
    String nome = scan.nextLine();
    vendedor.setNome(nome);
    System.out.println("Informe o valor do salário fixo: ");
    double salarioFixo = scan.nextDouble();
    vendedor.setSalarioFixo(salarioFixo);
    System.out.println("Informe o valor das vendas desse vendedor: ");
    double vendas = scan.nextDouble();
    vendedor.setVendas(vendas);

    double salarioFinal = vendedor.calculoComissao(vendedor.getSalarioFixo(), vendedor.getVendas());

    System.out.println("Vendedor: " + vendedor.getNome());
    System.out.printf("Salário fixo: R$%.2f%n",  vendedor.getSalarioFixo());
    System.out.printf("Vendas: R$%.2f%n", vendedor.getVendas());
    System.out.printf("Salário final: R$%.2f", salarioFinal);



    scan.close();
  }
}
