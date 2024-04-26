package br.edu.up;

import java.util.Scanner;
import br.edu.up.Modelos.Pessoa;

public class Exercicio11 {
  public static void executar(){

    /* Escrever um programa que leia o nome e o sexo de 56 pessoas e informe o nome e se ela é homem ou mulher. 
    No final informe total de homens e de mulheres. */

    Scanner scan = new Scanner(System.in);
    Pessoa pessoa = new Pessoa();

    System.out.println("Informe quantas vezes o programa vai rodar: ");
    int n = Integer.parseInt(scan.nextLine());
    String nomes[] = new String[n];
    char generos[] = new char[n];

    for (int i = 0; i < n; i++) {
        System.out.println("Informe o nome da " + (i + 1) + "ª pessoa: ");
        String nome = scan.nextLine();
        pessoa.setNome(nome);
        nomes[i] = pessoa.getNome();
        System.out.println("Informe o gênero da " + (i + 1) + "ª pessoa (M / F): ");
        char genero = scan.next().charAt(0);
        scan.nextLine();
        pessoa.setGenero(genero);
        generos[i] = pessoa.getGenero();
    }

    int feminino = 0;
    int masculino = 0;

    for(int i = 0; i < n; i++) {
      System.out.println(nomes[i]);
    }

    for(int i = 0; i < n; i++) {
      if (generos[i] == 'f' || generos[i] == 'F') {
        System.out.println("Nome: " + nomes[i] + " | Gênero: Feminino.");
        feminino++;
      } else if (generos[i] == 'm' || generos[i] == 'M') {
        System.out.println("Nome: " + nomes[i] + " | Gênero: Masculino.");
        masculino++;
      } else {
        System.out.println("Nome: " + nomes[i] + " | Gênero incorreto.");
      }
    }

    System.out.println("Total homens: " + masculino);
    System.out.println("Total mulheres: " + feminino);



    scan.close();
  }
}
