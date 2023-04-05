package model;

import controller.TelaController;
import java.lang.Thread;

/* ***************************************************************
* Autor:Ana Beatriz Silva e Silva 
* Matricula: 202110226
* Inicio: 17/03/2023
* Ultima alteracao: 
24/03/2023
* Nome: Arvore genealogica
* Funcao: Exibe uma arvore genealogica utilizando threads.Essa classe thread Bisneto é filha da thread NetoUm, assim
*ela vai resolver suas tarefas para execucao 
*************************************************************** */

public class Bisneto extends Thread { // classe bisneto extendendo a classe thread
  TelaController tela = new TelaController(); // declarando a variavel tela do tipo TelaController que ira da acesso
                                              // para a troca de imagens

  public void run() {
    tela.bisneto(1);// tela chama a funcao onde ira colocar a imagem do bisneto bebe
    System.out.println("Nasce a Smurf Vexy (Bisneta)"); // nasce o bisneto
    try { // para o uso do metodo sleep

      for (int i = 0; i <= 12; i++) { // for do nascimento do bisneto ate sua idade de morte (12 anos)
        if (i == 10) { // se a idade do bisneto for igual a 10
          tela.bisneto(2); // a imagem mudara para ele mais velho
        } // fim do if

        sleep(1000);// a thread "dorme" por 1000 milisegundos

      } // fim do for
      tela.bisneto(3);// mudança da imagem do bisneto para a de um caixao

      System.out.println("Vexy (Bisneta) morre");// bisneta morre

    } catch (InterruptedException e) { // pega a excecao e trata
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
  public void setJnl(TelaController jnl) {
    tela = jnl;
  }// fim do metodo setJnl
}// fim da classe bisneto
