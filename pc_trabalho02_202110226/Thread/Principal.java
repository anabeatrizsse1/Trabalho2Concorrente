import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import controller.TelaController;

/* ***************************************************************
* Autor:Ana Beatriz Silva e Silva 
* Matricula: 202110226
* Inicio: 17/03/2023
* Ultima alteracao: 24/03/2023
* Nome: Arvore genealogica com Threads
* Funcao: Exibe uma arvore genealogica utilizando threads
*************************************************************** */

public class Principal extends Application {

  public static Parent root;
  public static Stage stage = new Stage();

  @Override
  public void start(Stage stage) throws Exception {
    root = FXMLLoader.load(getClass().getResource("/view/tela.fxml"));
    Scene scene = new Scene(root);
    Principal.stage.setTitle("Arvore Geneologica");
    // Principal.stage.getIcons().add(new Image("/view/telaprincipal.jpg"));
    Principal.stage.getIcons().add(new Image("/view/arvore.png"));
    Principal.stage.setScene(scene);
    Principal.stage.setResizable(false);
    Principal.stage.sizeToScene();
    Principal.stage.centerOnScreen();
    Principal.stage.show();
  }

  public static void main(String[] args) {
    launch(args);
  }

}
