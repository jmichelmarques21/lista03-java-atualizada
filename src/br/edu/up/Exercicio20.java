package br.edu.up;

import java.util.Scanner;
import br.edu.up.Modelos.Professor;

public class Exercicio20 {
  public static void executar(){

    /* Exercicio 20 - A escola “APRENDER” faz o pagamento de seus professores por hora/aula. Faça um programa que calcule e exiba o salário de um professor. 
    Sabe-se que o valor da hora/aula segue a tabela abaixo:
    - Professor Nível 1 R$12,00 por hora/aula;
    - Professor Nível 2 R$17,00 por hora/aula;
    - Professor Nível 3 R$25,00 por hora/aula. */

    Scanner scan = new Scanner(System.in);
    Professor professor = new Professor();

    System.out.println("Informe o nível do professor: ");
    double nivel = scan.nextDouble();
    professor.setNivel(nivel);
    System.out.println("Informe a carga horária trabalhada: ");
    double cargaHoraria = scan.nextDouble();
    professor.setCargaHoraria(cargaHoraria);

    professor.calculoSalarioProfessor(professor.getCargaHoraria(), professor.getNivel());







    scan.close();
  }
}
