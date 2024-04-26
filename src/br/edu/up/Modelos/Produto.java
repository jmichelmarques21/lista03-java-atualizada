package br.edu.up.Modelos;

public class Produto {
  private double custo;
  private double ValorDeVenda;
  private double percentual;

  public double calcularValorVenda(double custo, double percentual) {
    double valorVenda = (this.custo + (this.custo * (this.percentual / 100)));
    return valorVenda;
  }

  public double getCusto() {
    return custo;
  }

  public void setCusto(double custo) {
    this.custo = custo;
  }

  public double getPercentual() {
    return percentual;
  }

  public void setPercentual(double percentual) {
    this.percentual = percentual;
  }

  public double getValorDeVenda() {
    return ValorDeVenda;
  }

  public void setValorDeVenda(double valorDeVenda) {
    ValorDeVenda = valorDeVenda;
  }

  
}
