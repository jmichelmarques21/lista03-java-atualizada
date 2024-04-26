package br.edu.up;

import java.util.Scanner;

public class Exercicio10 {
  public static void executar(){

    /* Faça um programa que receba a idade de um número finito de pessoas e mostre mensagem informando “maior de idade” e “menor de idade” 
    para cada pessoa. Considerar a pessoa com 18 anos como maior de idade. */

    Scanner scan = new Scanner(System.in);

    System.out.println("Quantas pessoas serão computadas? ");
    int quantPessoas = scan.nextInt();
    int idades[] = new int[quantPessoas];

    for(int i = 0; i < idades.length; i++) {
      System.out.println("Informe a idade da " + (i + 1) + "ª pessoa: ");
      idades[i] = scan.nextInt();
    }

    for(int i = 0; i < idades.length; i++) {
      if (idades[i] >= 18) {
        System.out.println("Posição [" + i + "] Idade: " + idades[i] + " anos. Maior de idade!");
      } else {
        System.out.println("Posição [" + i + "] Idade: " + idades[i] + " anos. Menor de idade!");
      }
    }


    scan.close();
  }
}
