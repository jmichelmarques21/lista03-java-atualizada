package br.edu.up;

import java.util.Scanner;
import br.edu.up.Modelos.Segurado;

public class Exercicio26 {
  public static void executar(){

/* Uma seguradora possui nove categorias de seguro baseadas na idade e ocupação do segurado. Somente pessoas com pelo menos 17 anos e não 
mais que 70 anos podem adquirir apólices de seguro. Quanto às classes de ocupações, foram definidos três grupos de risco: baixo, médio e alto.
A tabela abaixo fornece as categorias em função da faixa etária e do grupo de risco. Dados nome, idade e grupo de risco de um pretendente, 
determinar e imprimir seus dados e categoria. Caso a idade não esteja na faixa necessária, imprimir uma mensagem informando que ele não se enquadra
em nenhuma das categorias ofertadas. */
  
  Scanner scan = new Scanner(System.in);
  Segurado segurado = new Segurado();

  System.out.println("Informe o nome do pretendente: ");
  String nome = scan.nextLine();
  segurado.setNome(nome);
  System.out.println("Informe o grupo de risco: ");
  String grupoDeRisco = scan.nextLine();
  segurado.setGrupoDeRisco(grupoDeRisco);
  System.out.println("Informe a idade: ");
  int idade = scan.nextInt();
  segurado.setIdade(idade);


  segurado.categoriaPretendente(segurado.getIdade(), segurado.getGrupoDeRisco());





  scan.close();

  }
}
