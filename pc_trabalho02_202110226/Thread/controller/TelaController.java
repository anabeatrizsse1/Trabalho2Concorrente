package controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import model.*;

/* ***************************************************************
* Autor:Ana Beatriz Silva e Silva 
* Matricula: 202110226
* Inicio: 17/03/2023
* Ultima alteracao: 24/03/2023
* Nome: Arvore genealogica
* Funcao: Exibe uma arvore genealogica utilizando threads.Essa classe eh quem controla as threads e sua parte de interface. Por meio
* dela que as imagens podem se modificar
*************************************************************** */

public class TelaController implements Initializable {
  @FXML
  private ImageView pai = new ImageView(); // declarando e instanciando visualizador de imagens do pai
  @FXML
  private ImageView primeiroFilho = new ImageView(); // declarando e instanciando visualizador de imagens do
                                                     // primeiroFilho
  @FXML
  private ImageView segundoFilho = new ImageView(); // declarando e instanciando visualizador de imagens do segundoFilho
  @FXML
  private ImageView terceiroFilho = new ImageView(); // declarando e instanciando visualizador de imagens do
                                                     // terceiroFilho
  @FXML
  private ImageView primeiroNeto = new ImageView(); // declarando e instanciando visualizador de imagens do primeiroNeto
  @FXML
  private ImageView segundoNeto = new ImageView(); // declarando e instanciando visualizador de imagens do segundoNeto
  @FXML
  private ImageView bisneto = new ImageView(); // declarando e instanciando visualizador de imagens do bisneto

  /*
   * ***************************************************************
   * Metodo: pai
   * Funcao: Trocar imagens referentes ao pai durante a sua vida
   * Parametros: inteiro que representa a fase da vida do individuo
   * da arvore
   * Retorno: *sem retorno*
   */
  public void pai(int dady) { // metodo que vai instanciar a mudança de imagens
    Image imagem = null;
    switch (dady) {
      case 1:
        imagem = new Image("/view/paiBebe.png");// adicionando a imagem do pai bebê
        break;
      case 2:
        imagem = new Image("/view/paicom22.png");// adicionando a imagem do pai com 22 anos
        break;
      case 3:
        imagem = new Image("/view/paicom32.png");// adicionando a imagem do pai com 32 anos
        break;
      case 4:
        imagem = new Image("/view/paivelho.png");// adicionando a imagem do pai velho
        break;
      default:
        imagem = new Image("/view/caixao.png");// adicionando a imagem do caixao quando o pai morre
        break;
    } // fim do switch
    pai.setImage(imagem);// a imagem do ImageView do pai será mudada aqui
  }// fim do metodo

  /*
   * ***************************************************************
   * Metodo: primeiroFilho
   * Funcao: Trocar imagens referentes ao primeiro filho durante a sua vida
   * Parametros: inteiro que representa a fase da vida do individuo
   * da arvore
   * Retorno: *sem retorno*
   */
  public void primeiroFilho(int son1) {
    Image imagem = null;
    switch (son1) {
      case 1:
        imagem = new Image("/view/Filho1Bebe.png");// adicionando a imagem do Filho1 Bebe
        break;
      case 2:
        imagem = new Image("/view/Filho1Jovem.png");// adicionando a imagem do Filho1 jovem
        break;
      case 3:
        imagem = new Image("/view/Filho1Velho.png");// adicionando a imagem do Filho1 velho
        break;
      default:
        imagem = new Image("/view/caixao.png");// adicionando a imagem do caixao
        break;
    }
    primeiroFilho.setImage(imagem); // a imagem do ImageView do primeiro filho será mudada aqui
  }

  /*
   * ***************************************************************
   * Metodo: segundoFilho
   * Funcao: Trocar imagens referentes ao segundo filho durante a sua vida
   * Parametros: inteiro que representa a fase da vida do individuo
   * da arvore
   * Retorno: *sem retorno*
   */
  public void segundoFilho(int son2) {
    Image imagem = null;
    switch (son2) {
      case 1:
        imagem = new Image("/view/Filho2Bebe.png"); // adicionando a imagem do Filho2 Bebe
        break;
      case 2:
        imagem = new Image("/view/Filho2Jovem.png");// adicionando a imagem do Filho2 jovem
        break;
      case 3:
        imagem = new Image("/view/Filho2Velho.png");// adicionando a imagem do Filho2 velho
        break;
      default:
        imagem = new Image("/view/caixao.png");// adicionando a imagem do caixao
        break;
    }
    segundoFilho.setImage(imagem);// a imagem do ImageView do segundo filho será mudada aqui
  }

  /*
   * ***************************************************************
   * Metodo: terceiroFilho
   * Funcao: Trocar imagens referentes ao terceiro filho durante a sua vida
   * Parametros: inteiro que representa a fase da vida do individuo
   * da arvore
   * Retorno: *sem retorno*
   */
  public void terceiroFilho(int son3) {
    Image imagem = null;
    switch (son3) {
      case 1:
        imagem = new Image("/view/Filha3Bebe.png");// adicionando a imagem da Filha3 bebe
        break;
      case 2:
        imagem = new Image("/view/Filha3Jovem.png");// adicionando a imagem da Filha3 jovem
        break;
      case 3:
        imagem = new Image("/view/Filha3Velha.png");// adicionando a imagem da Filha3 velha
        break;
      default:
        imagem = new Image("/view/caixao.png");// adicionando a imagem do caixao
        break;
    }
    terceiroFilho.setImage(imagem);// a imagem do ImageView do terceiro filho será mudada aqui
  }

  /*
   * ***************************************************************
   * Metodo: primeiroNeto
   * Funcao: Trocar imagens referentes ao primeiro neto durante a sua vida
   * Parametros: inteiro que representa a fase da vida do individuo
   * da arvore
   * Retorno: *sem retorno*
   */
  public void primeiroNeto(int neto1) {
    Image imagem = null;
    switch (neto1) {
      case 1:
        imagem = new Image("/view/Neta1bebe.png");// adicionando a imagem da Neta1 bebe
        break;
      case 2:
        imagem = new Image("/view/Neta1jovem.png");// adicionando a imagem da Neta1 jovem
        break;
      default:
        imagem = new Image("/view/caixao.png");// adicionando a imagem do caixao
        break;
    }
    primeiroNeto.setImage(imagem);// a imagem do ImageView do primeiro neto será mudada aqui
  }

  /*
   * ***************************************************************
   * Metodo: segundoNeto
   * Funcao: Trocar imagens referentes ao primeiro neto durante a sua vida
   * Parametros: inteiro que representa a fase da vida do individuo
   * da arvore
   * Retorno: *sem retorno*
   */
  public void segundoNeto(int neto2) {
    Image imagem = null;
    switch (neto2) {
      case 1:
        imagem = new Image("/view/Neto2Bebe.png");// adicionando a imagem da Neta2 bebe
        break;
      case 2:
        imagem = new Image("/view/Neto2Jovem.png");// adicionando a imagem da Neta2 jovem
        break;
      default:
        imagem = new Image("/view/caixao.png");// adicionando a imagem do caixao
        break;
    }
    segundoNeto.setImage(imagem);// a imagem do ImageView da segunda neta será mudada aqui
  }

  /*
   * ***************************************************************
   * Metodo: bisneto
   * Funcao: Trocar imagens referentes ao bisneto durante a sua vida
   * Parametros: inteiro que representa a fase da vida do individuo
   * da arvore
   * Retorno: *sem retorno*
   */
  public void bisneto(int bisn) {
    Image imagem = null;
    switch (bisn) {
      case 1:
        imagem = new Image("/view/BisnetaBebe.png");// adicionando a imagem da Bisneta bebe
        break;
      case 2:
        imagem = new Image("/view/BisnetaJovem.png");// adicionando a imagem da Bisneta jovem
        break;
      default:
        imagem = new Image("/view/caixao.png");// adicionando a imagem do caixao
        break;
    }
    bisneto.setImage(imagem);// a imagem do ImageView do bisneto será mudada aqui
  }

  @Override
  public void initialize(URL location, ResourceBundle resources) { // ira inicializar o controlador
    Pai pai = new Pai(); // instanciando uma variavel tipo Pai
    pai.SetJnl(this); // passando a classe TelaController para a classe Pai
    pai.start(); // dando inicio ao a variavel pai
  }// fim do initialize

}// fim do controller
