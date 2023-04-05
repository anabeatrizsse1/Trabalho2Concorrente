package model;

import controller.TelaController;
import java.lang.Thread;

/* ***************************************************************
* Autor:Ana Beatriz Silva e Silva 
* Matricula: 202110226
* Inicio: 17/03/2023
* Ultima alteracao: 24/03/2023
* Nome: Arvore genealogica
* Funcao: Exibe uma arvore genealogica utilizando threads.Essa classe thread FilhoTres é filha da thread pai, assim
*ela vai resolver suas tarefas para execucao 
*************************************************************** */
public class FilhoTres extends Thread {// classe FilhoTres extendendo a classe thread
  TelaController tela = new TelaController();// declarando a variavel tela do tipo TelaController que ira da acesso para
                                             // a troca de imagens

  public void run() {
    tela.terceiroFilho(1);// inicia colocando a imagem do terceiro filho

    System.out.println("Nasce a Smurffete (terceira filha)");

    try {// para o uso do metodo sleep

      for (int i = 0; i <= 55; i++) {// for do nascimento do terceiro filho ate sua idade de morte (55 anos)
        if (i == 20) {// se a idade do segundo filho for igual a 20
          tela.terceiroFilho(2);// a imagem mudara
        }
        if (i == 50) {// se a idade do segundo filho for igual a 50
          tela.terceiroFilho(3);// a imagem mudara

        }
        sleep(1000);// a thread "dorme" por 1000 milisegundos

      }
      tela.terceiroFilho(4);// a imagem mudara

      System.out.println("Smurffete (terceira filha) morre");

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
  }// fim do SetJnl
}// fim da thread
