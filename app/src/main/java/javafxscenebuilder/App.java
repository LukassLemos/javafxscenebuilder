/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package javafxscenebuilder;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {
    
	
    public static void main(String[] args) {
    		launch();
    }
  

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		FXMLLoader fxmlLoader = new FXMLLoader();
		fxmlLoader.setLocation(getClass().getResource("/telaAplicacao.fxml"));
		Parent content = fxmlLoader.load();
		
		Scene cena = new Scene(content, 800,600);
		primaryStage.setTitle("Sistema de Backup");
		primaryStage.setScene(cena);
		primaryStage.show();	
	}
}
