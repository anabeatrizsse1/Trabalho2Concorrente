package model;

import controller.TelaController;
import java.lang.Thread;

/* ***************************************************************
* Autor:Ana Beatriz Silva e Silva 
* Matricula: 202110226
* Inicio: 17/03/2023
* Ultima alteracao: 24/03/2023
* Nome: Arvore genealogica
* Funcao: Exibe uma arvore genealogica utilizando threads.Essa classe thread FilhoUm é filha da thread pai, assim
*ela vai resolver suas tarefas para execucao 
*************************************************************** */
public class FilhoUm extends Thread {// classe FilhoUm extendendo a classe thread

  NetoUm primeiroNeto = new NetoUm();// instanciando o primeiro neto
  TelaController tela = new TelaController();// declarando a variavel tela do tipo TelaController que ira da acesso para
                                             // a troca de imagens

  public void run() {
    tela.primeiroFilho(1);// inicia colocando a imagem do primeiro filho
    System.out.println("Nasce o Smurf Desastrado(primeiro filho)");

    try {// para o uso do metodo sleep

      for (int i = 0; i <= 61; i++) {// for do nascimento do primeiro filho ate sua idade de morte (61 anos)
        if (i == 15) {// se a idade do segundo filho for igual a 15
          tela.primeiroFilho(2);// a imagem mudara

        }
        if (i == 16) {// se a idade do segundo filho for igual a 16
          primeiroNeto.start();// inicia a thread Neto1
        }
        if (i == 50) {// se a idade do segundo filho for igual a 50
          tela.primeiroFilho(3);// a imagem mudara
        }
        sleep(1000);// a thread "dorme" por 1000 milisegundos

      }
      tela.primeiroFilho(4);// a imagem mudara

      System.out.println("Smurf Desastrado (primeiro filho) morre");

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
  public void SetJnlI(TelaController jnl) {
    tela = jnl;// tela recebe a classe controladora
    primeiroNeto.SetJnl(jnl);// segundo neto recebe o controlador da telaController
  }// fim do SetJnl
}// fim da thread
