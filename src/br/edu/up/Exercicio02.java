package br.edu.up;

import java.util.Scanner;
import br.edu.up.Modelos.Carro;

public class Exercicio02 {
  public static void executar(){

    /*  Escrever um programa para determinar o consumo médio de um automóvel sendo fornecida 
    a distância total percorrida pelo automóvel e o total de combustível gasto. */

    Scanner scan = new Scanner(System.in);

    Carro carro = new Carro();

    System.out.println("Informe a distância total percorrida: ");
    float distancia = scan.nextFloat();
    carro.setDistancia(distancia);
    System.out.println("Informe o total de combustível gasto: ");
    float combustivel = scan.nextFloat();
    carro.setCombustivel(combustivel);

    float media = carro.calcularConsumo(carro.getDistancia(), carro.getCombustivel());

    System.out.println();
    System.out.printf("O consumo médio do carro é: %.2f", media, "litros por km.");


    scan.close();
  }
}
