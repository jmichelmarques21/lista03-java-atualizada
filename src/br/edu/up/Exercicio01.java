package br.edu.up;

import java.util.Scanner;
import br.edu.up.Modelos.Aluno;

public class Exercicio01 {
  public static void executar(){

    /* Escrever um programa que leia o nome de um aluno e as notas das três provas que ele obteve no semestre. 
    No final informar o nome do aluno e a sua média (aritmética). */

    Scanner scan = new Scanner(System.in);

    Aluno aluno = new Aluno();
    System.out.println("Informe o nome do aluno: ");
    String nome = scan.nextLine();
    aluno.setNome(nome);
    System.out.println("Informe as três notas do aluno: ");
    float n1 = scan.nextFloat();
    aluno.setNota1(n1);    
    float n2 = scan.nextFloat();
    aluno.setNota2(n2);
    float n3 = scan.nextFloat();
    aluno.setNota3(n3);
    double media = aluno.calcularMedia(aluno.nota1, aluno.nota2, aluno.nota3);

    System.out.println("Aluno: " + aluno.getNome());
    System.out.printf("Média: %.2f", media);

    scan.close();

  }
}
