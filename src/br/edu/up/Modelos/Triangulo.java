package br.edu.up.Modelos;

public class Triangulo {
  private int lado1;
  private int lado2;
  private int lado3;


  public String calcularTipoTriangulo(int l1, int l2, int l3){
    if (l1 == l2 && l1 == l3 && l2 == l3) {
      String tipoTriangulo = "Triangulo Equilátero";
      return tipoTriangulo;
    } else if (l1 != l2 && l1 != l3){
      String tipoTriangulo = "Triângulo Escaleno";
      return tipoTriangulo;
    } else {
      String tipoTriangulo = "Triângulo Isóscele";
      return tipoTriangulo;
    }
  }


  public int getLado1() {
    return lado1;
  }


  public void setLado1(int lado1) {
    this.lado1 = lado1;
  }


  public int getLado2() {
    return lado2;
  }


  public void setLado2(int lado2) {
    this.lado2 = lado2;
  }


  public int getLado3() {
    return lado3;
  }


  public void setLado3(int lado3) {
    this.lado3 = lado3;
  }

  
}
