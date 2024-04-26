package br.edu.up;

import java.util.Scanner;
import br.edu.up.Modelos.Pessoa;

public class Exercicio13 {
  public static void executar(){

    /* Escrever um programa que leia os dados de “N” pessoas (nome, sexo, idade e saúde) e informe se está apta ou não 
    para cumprir o serviço militar obrigatório. Informe os totais. */

    Scanner scan = new Scanner(System.in);

    Pessoa pessoa = new Pessoa();

    System.out.println("Informe a quantidade de pessoas que serão calculadas: ");
    int n = scan.nextInt();
    
    String nomes[] = new String[n];
    char generos[] = new char[n];
    int idades[] = new int[n];
    char saude[] = new char[n];
    int apto = 0;
    int inapto = 0;

    for (int i = 0; i < n; i++) {
      System.out.println("Informe o nome da " + (i + 1) + "ª pessoa: ");
      String nome = scan.nextLine();
      scan.next();
      pessoa.setNome(nome);
  
      nomes[i] = pessoa.getNome();
      System.out.println("Informe o gênero da " + (i + 1) + "ª pessoa: ");
      char genero = scan.next().charAt(0);
      pessoa.setGenero(genero);
      generos[i] = pessoa.getGenero();
      System.out.println("Informe a idade da " + (i + 1) + "ª pessoa: ");
      int idade = scan.nextInt();
      pessoa.setIdade(idade);
      idades[i] = pessoa.getIdade();
      System.out.println("Informe a estado de saúde da " + (i + 1) + "ª pessoa (Apto / Inapto):");
      char _saude = scan.next().charAt(0);
      pessoa.setSaude(_saude);
      saude[i] = pessoa.getSaude();
    }

    for (int i = 0; i < n; i++) {
      if (saude[i] == 'A' || saude[i] == 'a') {
        apto += 1;
      } else if (saude[i] == 'I' || saude[i] == 'i') {
        inapto += 1;
      }
    }
    System.out.println("Quantidade de pessoas aptas: " + apto);
    System.out.println("Quantidade de pessoas inaptas: " + inapto);








    scan.close();
  }
}
