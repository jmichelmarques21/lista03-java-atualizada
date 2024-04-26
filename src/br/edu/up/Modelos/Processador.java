package br.edu.up.Modelos;

import java.util.Queue;

public class Processador {
  public int verificaNumeros(Queue<Integer> numeros) {
    int cont = 0;

    for(Integer numero : numeros) {
      if (numero >=10 && numero <= 150) {
        cont++;
      }
    }

    return cont;
  }

  
}
