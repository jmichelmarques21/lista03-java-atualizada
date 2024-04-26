package br.edu.up;

import java.util.Scanner;
import br.edu.up.Modelos.Pessoa;

public class Exercicio23 {
public static void executar(){

/* Faça um programa que leia o nome, o sexo, a altura e a idade de uma pessoa. Calcule e mostre
nome e o seu peso ideal de acordo com as seguintes características da pessoa: */

Scanner scan = new Scanner(System.in);
Pessoa pessoa = new Pessoa();

System.out.println("Informe o nome da pessoa: ");
String nome = scan.nextLine();
pessoa.setNome(nome);
System.out.println("Informe o gênero: ");
char genero = scan.next().charAt(0);
pessoa.setGenero(genero);
System.out.println("Informe a altura: ");
double altura = scan.nextDouble();
pessoa.setAltura(altura);
System.out.println("Informe a idade: ");
int idade = scan.nextInt();
pessoa.setIdade(idade);

pessoa.calcularPesoIdeal(pessoa.getGenero(), pessoa.getAltura(), pessoa.getIdade());




scan.close();
}
}
