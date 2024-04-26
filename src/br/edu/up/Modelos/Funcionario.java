package br.edu.up.Modelos;

public class Funcionario {
  private String nome;
  private int idade;
  private char genero;
  private double salario;

  public double calcularNovoSalario(double salario, double salarioMinimo) {
    if (this.salario < salarioMinimo * 3) {
      double ajusteSalario = this.salario + (this.salario * 0.50);
      return ajusteSalario;
     } else if (this.salario > salarioMinimo * 3 && this.salario <= salarioMinimo * 10) {
      double ajusteSalario = this.salario + (this.salario * 0.20);
      return ajusteSalario;
     } else if (this.salario > salarioMinimo * 10) {
      double ajusteSalario = this.salario + (this.salario * 0.15);
      return ajusteSalario;
     } else {
      double ajusteSalario = this.salario + (this.salario * 0.10);
      return ajusteSalario;
     }
  }

  public double calcularAbono(char genero, int idade){
    if (this.genero == 'M' & this.idade >= 30){
      double abono = 100;
      return abono;
    } else if (this.genero == 'M' & this.idade < 30) {
      double abono = 50;
      return abono;
    } else if (this.genero == 'F' & this.idade >= 30) {
      double abono = 200;
      return abono;
    } else {
      double abono = 80;
      return abono;
    }
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public int getIdade() {
    return idade;
  }

  public void setIdade(int idade) {
    this.idade = idade;
  }

  public char getGenero() {
    return genero;
  }

  public void setGenero(char genero) {
    this.genero = genero;
  }

  public double getSalario() {
    return salario;
  }

  public void setSalario(double salario) {
    this.salario = salario;
  }


}
