package br.edu.up.Modelos;

public class Cliente {
  private int tipoCliente;
  private double quantidadeKwh;

  public void calcularContaLuz(int tipoCliente, double quantidadeKwh) {
    if (tipoCliente == 1) {
      double conta = quantidadeKwh * 0.60;
      System.out.printf("Cliente do tipo 1 (Residência) - Valor da conta: R$%.2f%n", conta);
    } else if (tipoCliente == 2) {
      double conta = quantidadeKwh * 0.48;
      System.out.printf("Cliente do tipo 2 (Comércio) - Valor da conta: R$%.2f%n", conta);
    } else if (tipoCliente == 3) {
      double conta = quantidadeKwh * 1.29;
      System.out.printf("Cliente do tipo 3 (Indústria) - Valor da conta: R$%.2f%n", conta);
    } else {
      System.out.println("O tipo de cliente informado é inválido.");
    }


    
  }

  public int getTipoCliente() {
    return tipoCliente;
  }

  public void setTipoCliente(int tipoCliente) {
    this.tipoCliente = tipoCliente;
  }

  public double getQuantidadeKwh() {
    return quantidadeKwh;
  }

  public void setQuantidadeKwh(double quantidadeKwh) {
    this.quantidadeKwh = quantidadeKwh;
  }
}
