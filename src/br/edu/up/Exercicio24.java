package br.edu.up;

import java.util.Scanner;
import br.edu.up.Modelos.Aluno;

public class Exercicio24 {
  public static void executar(){

/* Em um curso de Ciência da Computação a nota do estudante é calculada a partir de três notas atribuídas, respectivamente, 
a um trabalho de laboratório, a uma avaliação semestral e a um exame final. As notas variam, de 0 a 10 e a nota final é a média ponderada 
das três notas mencionadas.
A lista abaixo fornece os pesos:
a. Laboratório: peso 2
b. Avaliação semestral: peso 3
c. Exame final: peso 5 */

Scanner scan = new Scanner(System.in);
Aluno aluno = new Aluno();

System.out.println("Informe as 3 notas do aluno: ");
aluno.nota1 = scan.nextFloat();
aluno.nota2 = scan.nextFloat();
aluno.nota3 = scan.nextFloat();

aluno.calcularMediaPonderada(aluno.nota1, aluno.nota2, aluno.nota3);


scan.close();
  }
}
