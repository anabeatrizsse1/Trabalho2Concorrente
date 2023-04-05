package model;

import controller.TelaController;
import java.lang.Thread;
/* ***************************************************************
* Autor:Ana Beatriz Silva e Silva 
* Matricula: 202110226
* Inicio: 17/03/2023
* Ultima alteracao: 24/03/2023
* Nome: Arvore genealogica
* Funcao: Exibe uma arvore genealogica utilizando threads.Essa classe thread NetoUm é filha da thread FilhoUm, assim
*ela vai resolver suas tarefas para execucao 
*************************************************************** */

public class NetoUm extends Thread {// classe bisneto extendendo a classe thread
  Bisneto bisneto = new Bisneto();// instanciando o segundo neto
  TelaController tela = new TelaController();// declarando a variavel tela do tipo TelaController que ira da acesso para
                                             // a troca de imagens

  public void run() {
    tela.primeiroNeto(1);// inicia colocando a imagem do primeiro filho

    System.out.println("Nasce a SmurfBlossom ( Primeira neta)");

    try {// para o uso do metodo sleep
      for (int i = 0; i <= 35; i++) {// for do nascimento do Pirmeiro neto ate sua idade de morte (35 anos)
        if (i == 29) {// se a idade do segundo filho for igual a 29
          tela.primeiroNeto(2);// a imagem mudara

        }
        if (i == 30) {// se a idade do segundo filho for igual a 30
          bisneto.start();// inicia a thread bisneto
        }
        sleep(1000);// a thread "dorme" por 1000 milisegundos
      }
      tela.primeiroNeto(3);// a imagem mudara

      System.out.println("SmurfBlossom (Primeira neta) morre");

    } catch (InterruptedException e) {// pega a excecao e trata
      e.printStackTrace();// imprime no terminal a excecao
    } // fim try - catch
  }// fim do run

  /*
   * ***************************************************************
   * Metodo: setJnl
   * Funcao: atribui a classe controladora a variavel que sera usada
   * pela classe
   * Parametros: jnl ira controlar a tela
   * Retorno: *sem retorno*
   */
  public void SetJnl(TelaController jnl) {
    tela = jnl;// tela recebe a classe controladora
    bisneto.setJnl(jnl);
  }// fim do SetJnl
}// fim da thread
