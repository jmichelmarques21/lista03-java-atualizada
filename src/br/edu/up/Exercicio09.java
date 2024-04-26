package br.edu.up;
import br.edu.up.Modelos.Processador;

import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;

public class Exercicio09 {
  public static void executar(){

    /*  Ler 80 números e ao final informar quantos número(s) est(á)ão no intervalo entre 10 (inclusive) e 150 (inclusive). */

    Scanner scan = new Scanner(System.in);
    Processador numero = new Processador();
    Queue<Integer> numeros = new LinkedList<>();

    System.out.println("Quantos números serão digitados? ");
    int n = scan.nextInt();

    for (int i = 0; i < n; i++) {
        System.out.println("Digite o " + (i + 1) + "º número: ");
        int num = scan.nextInt();
        numeros.offer(num);
    }

    int verifica = numero.verificaNumeros(numeros);
    System.out.println("Números fora do intervalo 10-150: " + verifica);
    



    scan.close();
    }
}