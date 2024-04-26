package br.edu.up;

import java.util.Scanner;
import br.edu.up.Modelos.Aluno;

public class Exercicio08 {
  public static void executar(){

    /* Escrever um programa que leia o nome e as três notas obtidas por um aluno durante o semestre.
    Calcular a sua média (aritmética), informar o nome e sua menção aprovado (media >= 7),
    Reprovado (media <= 5) e Recuperação (media entre 5.1 a 6.9). */

    Aluno aluno = new Aluno();
    Scanner scan = new Scanner(System.in);

    System.out.println("Informe o nome do aluno: ");
    String nome = scan.nextLine();
    aluno.setNome(nome);
    System.out.println("Informe as três notas do aluno: ");
    float nota1 = scan.nextFloat();
    aluno.setNota1(nota1);
    float nota2 = scan.nextFloat();
    aluno.setNota2(nota2);
    float nota3 = scan.nextFloat();
    aluno.setNota3(nota3);

    float media = aluno.calcularMedia(aluno.nota1, aluno.nota2, aluno.nota3);
    System.out.println("Aluno: " + aluno.getNome());
    if (media >= 7) {
      System.out.println("Aprovado!");
    } else if (media >= 5.1 && media <= 6.9) {
      System.out.println("Recuperação!");
    } else {
      System.out.println("Reprovado!");
    }
    scan.close();
  }
}
