package kalkulator;
import javafx.application.*;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
	@Override
	//tworzenie podstawowej sceny dla kalkulatora
		public void start (Stage primaryStage) {
		try {
			Parent root = FXMLLoader.load(getClass().getResource("Main.fxml"));
			Scene scena = new Scene(root,300,300);
		
			primaryStage.setScene(scena);
			primaryStage.show();
				}catch(Exception e) {
					e.printStackTrace();
				}
		}

	
			public static void main(String[] args) {
					launch(args);
			}
}