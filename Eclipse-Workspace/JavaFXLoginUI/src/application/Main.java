package application;
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
public class Main extends Application {
	public static void main(String[] args) {
		System.out.println("JavaFx Application Started");
		launch(args);
	}
	@Override
	public void start(Stage primaryStage) throws IOException {
		
			Parent rootnode = FXMLLoader.load(getClass().getResource("/application/Login.fxml"));
			Scene scene = new Scene(rootnode);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.setTitle("JavaFx Application");
			primaryStage.show();	
	}	
}
