package br.edu.up;

import java.util.Scanner;
import br.edu.up.Modelos.Aluno;

public class Exercicio25 {
  public static void executar() {

    /*
     * Dado o nome de um estudante, com o respectivo número de matrícula e as três
     * notas acima mencionadas, desenvolva um programa para
     * calcular a nota final e a classificação de cada estudante. A classificação é
     * dada conforme a lista abaixo:
     * Nota Final Classificação
     * [8,10] A
     * [7,8] B
     * [6,7] C
     * [5,6] D
     * [0,5] R
     * Imprima o nome do estudante, com o seu número, nota final e classificação.
     */

    Scanner scan = new Scanner(System.in);
    Aluno aluno = new Aluno();

    System.out.println("Informe o nome do aluno: ");
    String nome = scan.nextLine();
    aluno.setNome(nome);
    System.out.println("Informe a matrícula do aluno: ");
    String matricula = scan.nextLine();
    aluno.setMatricula(matricula);
    System.out.println("Informe as 3 notas do aluno: ");
    float nota1 = scan.nextFloat();
    aluno.setNota1(nota1);
    float nota2 = scan.nextFloat();
    aluno.setNota2(nota2);
    float nota3 = scan.nextFloat();
    aluno.setNota3(nota3);

    float mediaPonderada = aluno.calcularMediaPonderada(aluno.nota1, aluno.nota2, aluno.nota3);

    System.out.printf("O aluno %s, com matrícula número %s teve a média final de %.2f.", aluno.getNome(), aluno.getMatricula(), mediaPonderada);


    scan.close();
  }
}
