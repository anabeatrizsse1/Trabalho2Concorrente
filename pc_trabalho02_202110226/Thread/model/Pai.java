package model;

import java.lang.Thread;

import controller.TelaController;
/* ***************************************************************
* Autor:Ana Beatriz Silva e Silva 
* Matricula: 202110226
* Inicio: 17/03/2023
* Ultima alteracao: 24/03/2023
* Nome: Arvore genealogica
* Funcao: Exibe uma arvore genealogica utilizando threads.Essa classe thread pai é quem inicializa a thread, 
*dando start em FilhoUm, FilhoDois, FilhoTres, assim comecara a execucao do programa por aqui quando a thraed pai
*as tres threas forem inicializadas, resolvendo suas tarefas para execucao 
*************************************************************** */

public class Pai extends Thread {// classe bisneto extendendo a classe thread

  FilhoUm primeiroFilho = new FilhoUm(); // instanciando o primeiroFilho
  FilhoDois segundoFilho = new FilhoDois();// instanciando o segundoilho
  FilhoTres terceiroFilho = new FilhoTres();// instanciando o terceiroFilho
  TelaController tela = new TelaController();// declarando a variavel tela do tipo TelaController que ira da acesso para
                                             // a troca de imagens

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
    primeiroFilho.SetJnlI(jnl);// primeiroFilho recebe o controlador da telaController
    segundoFilho.SetJnl(jnl);// segundoFilho recebe o controlador da telaController
    terceiroFilho.SetJnl(jnl);// terceiroFilho recebe o controlador da telaController
  }

  public void run() {
    tela.pai(1);// inicia colocando a imagem do pai bebe

    System.out.println("Nasce o papai Smurf");

    try {// para o uso do metodo sleep

      for (int i = 0; i <= 90; i++) {// for do nascimento do pai ate sua idade de morte (90 anos)
        if (i == 20) {// se a idade do segundo filho for igual a 20
          tela.pai(2);// a imagem mudara
        }
        if (i == 22) {// se a idade do segundo filho for igual a 22

          primeiroFilho.start();// inicia a thread FilhoUm
        }

        if (i == 25) {// se a idade do segundo filho for igual a 25

          segundoFilho.start();// inicia a thread FilhoDois
        }
        if (i == 30) {// se a idade do segundo filho for igual a 30
          tela.pai(3);// a imagem mudara

        }

        if (i == 32) {// se a idade do segundo filho for igual a 32

          terceiroFilho.start();// inicia a thread FilhoTres
        }
        if (i == 50) {// se a idade do segundo filho for igual a 50
          tela.pai(4);// a imagem mudara

        }

        sleep(1000);// a thread "dorme" por 1000 milisegundos
      }
      tela.pai(5);// a imagem mudara
      System.out.println("Papai Smurf morre");

    }

    catch (InterruptedException e) {// pega a excecao e trata
      e.printStackTrace();// imprime no terminal a excecao
    } // fim try - catch
  }// fim do run
}// fim do a thread
