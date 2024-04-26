package br.edu.up.Modelos;


public class Pessoa {
  private String nome;
  private char genero;
  private int idade;
  private char saude;
  private double altura;


  public void calcularPesoIdeal(char genero, double altura, int idade){    
    if (genero == 'M' || genero == 'm') {
      if (altura > 1.70) {
        if (idade <= 20) {
          double pesoIdeal = (72.7 * altura) - 58;
          System.out.printf("Peso ideal para um homem com %.2f é: %.2f quilos.", altura, pesoIdeal); 
        } else if (idade >= 21 && idade <= 39) {
          double pesoIdeal = (72.7 * altura) - 53;
          System.out.printf("Peso ideal para um homem com %.2f é: %.2f quilos.", altura, pesoIdeal); 
        } else if (idade >= 40) {
          double pesoIdeal = (72.7 * altura) - 45;
          System.out.printf("Peso ideal para um homem com %.2f é: %.2f quilos.", altura, pesoIdeal); 
        }
      } else if (altura <= 1.70) {
        if (idade <= 40) {
          double pesoIdeal = (72.7 * altura) - 50;
          System.out.printf("Peso ideal para um homem com %.2f é: %.2f quilos.", altura, pesoIdeal); 
        } else if (idade > 40) {
          double pesoIdeal = (72.7 * altura) - 58;
          System.out.printf("Peso ideal para um homem com %.2f é: %.2f quilos.", altura, pesoIdeal); 
        }
      }
    } else if (genero == 'F' || genero == 'f'){
      if (altura > 1.50) {
        double pesoIdeal = (62.1 * altura) - 44.7;
        System.out.printf("Peso ideal para uma mulher com %.2f é: %.2f quilos.", altura, pesoIdeal); 
      } else if (altura <= 1.50) {
        if (idade >= 35) {
          double pesoIdeal = (62.1 * altura) - 45;
          System.out.printf("Peso ideal para uma mulher com %.2f é: %.2f quilos.", altura, pesoIdeal);   
        } else if (idade < 35) {
          double pesoIdeal = (62.1 * altura) - 49;
          System.out.printf("Peso ideal para uma mulher com %.2f é: %.2f quilos.", altura, pesoIdeal);   
        }
      }
    } else {
      System.out.println("Gênero inválido...");
    }
  }



  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public char getGenero() {
    return genero;
  }

  public void setGenero(char genero) {
    this.genero = genero;
  }

  public int getIdade() {
    return idade;
  }

  public void setIdade(int idade) {
    this.idade = idade;
  }

  public char getSaude() {
    return saude;
  }

  public void setSaude(char saude) {
    this.saude = saude;
  }

  public double getAltura() {
    return altura;
  }

  public void setAltura(double altura) {
    this.altura = altura;
  }
  
}
