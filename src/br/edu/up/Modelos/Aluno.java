package br.edu.up.Modelos;

public class Aluno {
  private String nome;
  public String matricula;
  public float nota1;
  public float nota2;
  public float nota3;

  public float calcularMedia(float n1, float n2, float n3) {
    float media = (n1 + n2 + n3) / 3;
    return media;
  }

  public float calcularMediaPonderada(float n1, float n2, float n3) {
    float media = ((n1 * 2) + (n2 * 3) + (n3 * 5)) / 10;
    return media;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getMatricula() {
    return matricula;
  }

  public void setMatricula(String matricula) {
    this.matricula = matricula;
  }

  public float getNota1() {
    return nota1;
  }

  public void setNota1(float nota1) {
    this.nota1 = nota1;
  }

  public float getNota2() {
    return nota2;
  }

  public void setNota2(float nota2) {
    this.nota2 = nota2;
  }

  public float getNota3() {
    return nota3;
  }

  public void setNota3(float nota3) {
    this.nota3 = nota3;
  }

  

}
