package br.edu.up;

import java.util.Scanner;
import br.edu.up.Modelos.Nadador;

public class Exercicio21 {
  public static void executar(){

/* Elabore um programa que, dada a idade de um nadador. Classifique-o em uma das seguintes categorias: 
Infantil A = 5 - 7 anos
Infantil B = 8 - 10 anos
Juvenil A = 11- 13 anos
Juvenil B = 14 - 17 anos
Sênior = 18 - 25 anos
Apresentar mensagem “idade fora da faixa etária” quando for outro ano não contemplado. */

Scanner scan = new Scanner(System.in);
Nadador nadador = new Nadador();

System.out.println("Informe a idade do nadador: ");
int idade = scan.nextInt();
nadador.setIdade(idade);

nadador.categoriaNadador(nadador.getIdade());








scan.close();


  }
}
