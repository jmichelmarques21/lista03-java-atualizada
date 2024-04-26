package br.edu.up.Modelos;

public class Professor {
  private double salario;
  private double nivel;
  private double cargaHoraria;


  public void calculoSalarioProfessor(double cargaHoraria, double nivel) {
    if (nivel == 1) {
      salario = cargaHoraria * 12;
      System.out.printf("Salário: R$%.2f%n", salario);
    } else if (nivel == 2) {
      salario = cargaHoraria * 17;
      System.out.printf("Salário: R$%.2f%n", salario);
    } else if (nivel == 3) {
      salario = cargaHoraria * 25;
      System.out.printf("Salário: R$%.2f%n", salario);
    } else {
      System.out.println("Nível incorreto.");
    }
  }


  public double getSalario() {
    return salario;
  }


  public void setSalario(double salario) {
    this.salario = salario;
  }


  public double getNivel() {
    return nivel;
  }


  public void setNivel(double nivel) {
    this.nivel = nivel;
  }


  public double getCargaHoraria() {
    return cargaHoraria;
  }


  public void setCargaHoraria(double cargaHoraria) {
    this.cargaHoraria = cargaHoraria;
  }

  
}
