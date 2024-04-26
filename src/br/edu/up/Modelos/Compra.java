package br.edu.up.Modelos;

public class Compra {
  private double valorCompra;


  public double calcularPrestacao(double valorCompra) {
    double parcela = valorCompra / 5;
    return parcela;
  }


  public double getValorCompra() {
    return valorCompra;
  }


  public void setValorCompra(double valorCompra) {
    this.valorCompra = valorCompra;
  }

  

}
