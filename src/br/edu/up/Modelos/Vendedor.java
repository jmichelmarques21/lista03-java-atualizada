package br.edu.up.Modelos;

public class Vendedor {

  private String nome;
  private double salarioFixo;
  private double vendas;

  public double calculoComissao(double salarioFixo, double vendas) {
    double comissao = this.salarioFixo + (this.vendas * 0.15);
    return comissao;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public double getSalarioFixo() {
    return salarioFixo;
  }

  public void setSalarioFixo(double salarioFixo) {
    this.salarioFixo = salarioFixo;
  }

  public double getVendas() {
    return vendas;
  }

  public void setVendas(double vendas) {
    this.vendas = vendas;
  }

  

}
