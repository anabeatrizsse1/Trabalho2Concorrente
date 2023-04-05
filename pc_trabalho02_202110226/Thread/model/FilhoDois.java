package model;

import controller.TelaController;
import java.lang.Thread;

/* ***************************************************************
* Autor:Ana Beatriz Silva e Silva 
* Matricula: 202110226
* Inicio: 17/03/2023
* Ultima alteracao: 24/03/2023
* Nome: Arvore genealogica
* Funcao: Exibe uma arvore genealogica utilizando threads.Essa classe thread FilhoDois é filha da thread pai, assim
*ela vai resolver suas tarefas para execucao 
*************************************************************** */

public class FilhoDois extends Thread {// classe bisneto extendendo a classe thread

  NetoDois segundoNeto = new NetoDois(); // instanciando o segundo neto
  TelaController tela = new TelaController();// declarando a variavel tela do tipo TelaController que ira da acesso para
                                             // a troca de imagens

  public void run() {
    tela.segundoFilho(1); // inicia colocando a imagem do segundo filho

    System.out.println("Nasce o Smurf Arrojado (segundo filho)");

    try {// para o uso do metodo sleep

      for (int i = 0; i <= 55; i++) {// for do nascimento do segundo filho ate sua idade de morte (55 anos)
        if (i == 19) {// se a idade do segundo filho for igual a 19
          tela.segundoFilho(2); // a imagem mudara

        }
        if (i == 20) {// se a idade do segundo filho for igual a 20
          segundoNeto.start(); // inicia a thread Neto2
        }
        if (i == 50) {// se a idade do segundo filho for igual a 50
          tela.segundoFilho(3);// a imagem mudara para ele mais velho
        }
        sleep(1000); // a thread "dorme" por 1000 milisegundos

      } // fim do for

      tela.segundoFilho(4);// a imagem mudara para um caixao

      System.out.println("Smurf Arrochado ( segundo filho) morre"); // segundo filho morre

    } catch (InterruptedException e) {// pega a excecao e trata
      e.printStackTrace();// imprime no terminal a excecao
    } // fim try - catch
  } // fim do run

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
    segundoNeto.setJnl(jnl); // segundo neto recebe o controlador da telaController
  }// fim do SetJnl
}// fim da thread
