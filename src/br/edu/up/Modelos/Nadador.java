package br.edu.up.Modelos;

public class Nadador {
  private int idade;

  public void categoriaNadador(int idade){
    if (idade >= 5 && idade <= 7) {
      System.out.println("Idade: " + idade + " - Categoria: Infantil A.");
    }  else if (idade >= 8 && idade <= 10) {
      System.out.println("Idade: " + idade + " - Categoria: Infantil B.");
    } else if (idade >= 11 && idade <= 13) {
      System.out.println("Idade: " + idade + " - Categoria: Juvenil A.");
    } else if (idade >= 14 && idade <= 17) {
      System.out.println("Idade: " + idade + " - Categoria: Juvenil B.");
    } else if (idade >= 18 && idade <= 25) {
      System.out.println("Idade: " + idade + " - Categoria: Sênior.");
    } else {
      System.out.println("Idade fora da faixa etária.");
    }
  }

  public int getIdade() {
    return idade;
  }

  public void setIdade(int idade) {
    this.idade = idade;
  }

  
}
