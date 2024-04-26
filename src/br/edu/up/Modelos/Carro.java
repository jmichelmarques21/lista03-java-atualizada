package br.edu.up.Modelos;

public class Carro {
  private double custo;
  private float distancia;
  private float combustivel;
  private int ano;
  private double valor;
  private char tipoCombustivel;

  public float calcularConsumo(float distancia, float combustivel) {
    float consumo = distancia / combustivel;
    return consumo;


    
  }

  public double getCusto() {
    return custo;
  }

  public void setCusto(double custo) {
    this.custo = custo;
  }

  public float getDistancia() {
    return distancia;
  }

  public void setDistancia(float distancia) {
    this.distancia = distancia;
  }

  public float getCombustivel() {
    return combustivel;
  }

  public void setCombustivel(float combustivel) {
    this.combustivel = combustivel;
  }

  public int getAno() {
    return ano;
  }

  public void setAno(int ano) {
    this.ano = ano;
  }

  public double getValor() {
    return valor;
  }

  public void setValor(double valor) {
    this.valor = valor;
  }

  public char getTipoCombustivel() {
    return tipoCombustivel;
  }

  public void setTipoCombustivel(char tipoCombustivel) {
    this.tipoCombustivel = tipoCombustivel;
  }
}
