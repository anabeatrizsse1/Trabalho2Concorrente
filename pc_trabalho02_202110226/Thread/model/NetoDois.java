package model;

import controller.TelaController;
import java.lang.Thread;

/* ***************************************************************
* Autor:Ana Beatriz Silva e Silva 
* Matricula: 202110226
* Inicio: 17/03/2023
* Ultima alteracao: 24/03/2023
* Nome: Arvore genealogica
* Funcao: Exibe uma arvore genealogica utilizando threads.Essa classe thread NetoDois é filha da thread FilhoDois, assim
*ela vai resolver suas tarefas para execucao 
*************************************************************** */

public class NetoDois extends Thread {// classe NetoDDois extendendo a classe thread
  TelaController tela = new TelaController();// declarando a variavel tela do tipo TelaController que ira da acesso para
                                             // a troca de imagens

  public void run() {
    tela.segundoNeto(1);// inicia colocando a imagem do segundo neto

    System.out.println("Nasce o Smurf Genio (Segundo neto)");

    try {// para o uso do metodo sleep
      for (int i = 0; i <= 33; i++) {// for do nascimento do segundo neto ate sua idade de morte (33 anos)
        if (i == 25) {// se a idade do segundo neto for igual a 25
          tela.segundoNeto(2);// a imagem mudara

        }
        sleep(1000);// a thread "dorme" por 1000 milisegundos
      }
      tela.segundoNeto(3);// a imagem mudara

      System.out.println("Smurf Genio (Segundo neto) morre");
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
  public void setJnl(TelaController jnl) {
    tela = jnl;// tela recebe a classe controladora
  }// fim do SetJnl
}// fim da thread
