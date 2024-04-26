package br.edu.up.Modelos;

public class Moeda {
  private double valor;
  private double cotacao;


  public double converterMoeda(double valor, double cotacao) {
    double valorConvertido = valor * cotacao;
    return valorConvertido;
  }


  public double getValor() {
    return valor;
  }


  public void setValor(double valor) {
    this.valor = valor;
  }


  public double getCotacao() {
    return cotacao;
  }


  public void setCotacao(double cotacao) {
    this.cotacao = cotacao;
  }

  
}
